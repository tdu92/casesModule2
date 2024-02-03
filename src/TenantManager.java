package src;

import IO.TenantIO_Binary;
import model.Tenant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenantManager extends Manager<Tenant> {

    List<Tenant> tenants = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Tenant create() {
        System.out.println("enter tenant name:");
        String name = scanner.nextLine();
        System.out.println("enter tenant year of birth");
        int YoB = Integer.parseInt(scanner.nextLine());
        return new Tenant(name, YoB);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < tenants.size(); i++) {
            if (tenants.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit() {
        try {
            System.out.println("enter tenant id to edit");
            int idToEdit = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(idToEdit);
            if (index != -1) {
                tenants.set(index, create());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        try {
            System.out.println("enter tenant id to delete");
            int idToDelete = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(idToDelete);
            if (index != -1) {
                tenants.remove(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write() {
        TenantIO_Binary.write(tenants);

    }

    @Override
    public void read() {
        tenants = TenantIO_Binary.read();
    }

}