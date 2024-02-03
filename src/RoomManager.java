package src;

import IO.RoomIO_Binary;
import model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManager extends Manager<Room>{
    List<Room> rooms = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Room create() {
        System.out.println("enter role id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter role name:");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("enter role name:");
        double price = Double.parseDouble(scanner.nextLine());
        return new Room(id, area, price);
    }

    public int findIndexById(int id) {
        for (int i=0; i<rooms.size(); i++) {
            if (rooms.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void edit(){
        try {
            System.out.println("enter room id to edit");
            int idToEdit = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(idToEdit);
            if (index != -1) {
                rooms.set(index, create());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(){
        try {
            System.out.println("enter room id to delete");
            int idToDelete = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(idToDelete);
            if (index != -1) {
                rooms.remove(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void read(){
        rooms = RoomIO_Binary.read();
    }
    public void write(){
        RoomIO_Binary.write(rooms);
    }
}
