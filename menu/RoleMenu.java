package menu;

import src.ContractManager;
import src.RoleManager;

import java.util.Scanner;

public class RoleMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        RoleManager roleManager = new RoleManager();
        while (true) {
            System.out.println("Menu: Role");
            System.out.println("1. Display roles");
            System.out.println("2. Add roles");
            System.out.println("3. Edit roles");
            System.out.println("4. Delete roles");
            System.out.println("5. Read from file");
            System.out.println("6. Write to file");
            System.out.println("7. Exit");
            int choice = 0;
            while (true) {
                try {
                    System.out.println("enter choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1: roleManager.display(); break;
                case 2: roleManager.add(roleManager.create()); break;
                case 3: roleManager.edit(); break;
                case 4: roleManager.delete(); break;
                case 5: roleManager.read(); break;
                case 6: roleManager.write(); break;
                case 7: return;
                default:
                    System.out.println("wrong choice"); break;
            }
        }
    }
}
