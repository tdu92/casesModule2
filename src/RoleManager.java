package src;

import IO.RoleIO_Binary;
import model.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoleManager extends Manager<Role> {
    List<Role> roles = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

     public Role create() {
         System.out.println("enter role id:");
        int id = Integer.parseInt(scanner.nextLine());
         System.out.println("enter role name:");
        String name = scanner.nextLine();
        return new Role(id, name);
    }

    public int findIndexByName(String name) {
        for (int i=0; i<roles.size(); i++) {
            if (roles.get(i).getRoleName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public void edit(){
        try {
            System.out.println("enter Role name to edit");
            String nameToEdit = scanner.nextLine();
            int index = findIndexByName(nameToEdit);
            if (index != -1) {
                roles.set(index, create());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(){
        try {
            System.out.println("enter Role name to delete");
            String nameToDelete = scanner.nextLine();
            int index = findIndexByName(nameToDelete);
            if (index != -1) {
                roles.remove(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void read(){
        roles = RoleIO_Binary.read();
    }
    public void write(){
        RoleIO_Binary.write(roles);
    }
}
