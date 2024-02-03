package src;

import IO.ContractIO_Binary;
import model.Contract;
import model.Room;
import model.Tenant;
import validate.ContractValidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContractManager extends Manager<Contract> {
    List<Contract> contracts = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
    List<Tenant> tenants = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ContractValidate contractValidate;

    public Room choiceRoom() {
        System.out.println("List of rooms");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(i + 1 + "," + rooms.get(i).getId() + ","
                    + rooms.get(i).getArea() + "," + rooms.get(i).getPrice());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        return rooms.get(choice - 1);
    }

    public Tenant choiceTenant() {
        System.out.println("List of tenants");
        for (int i = 0; i < tenants.size(); i++) {
            System.out.println(i + 1 + "," + tenants.get(i).getId() + ","
                    + tenants.get(i).getTenantName());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        return tenants.get(choice - 1);
    }

    public Contract create() {
        try {
        String date = ContractValidate.validate();
        Tenant tenant = choiceTenant();
        Room room = choiceRoom();
        return new Contract(date, tenant, room);
    } catch (Exception e) {
            System.err.println("Error: Wrong format");
        }
        return null;
    }
    public void add(Contract contract){contracts.add(contract);}

    public int findIndexById(int id) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getId() == id) {
                return i;
            }
        }
        return -1;

    }

    @Override
    public void edit() {
        try {
            System.out.println("enter contract id to edit");
            int idToEdit = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(idToEdit);
            if (index != -1) {
                contracts.set(index, create());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete() {
        try {
            System.out.println("enter contract id to delete");
            int idToDelete = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(idToDelete);
            if (index != -1) {
                contracts.remove(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write() {ContractIO_Binary.write(contracts);}

    @Override
    public void read() {contracts = ContractIO_Binary.read();}

}