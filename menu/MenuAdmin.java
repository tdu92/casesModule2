package menu;

import src.*;

import java.util.Scanner;

public class MenuAdmin {
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome Admin!");
            System.out.println("1. Account menu");
            System.out.println("2. Contract menu");
            System.out.println("3. Room menu");
            System.out.println("4. Role menu");
            System.out.println("5. Tenant menu");
            System.out.println("6. Logout");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: AccountMenu.menu(); break;
                case 2: ContractMenu.menu(); break;
                case 3: RoomMenu.menu(); break;
                case 4: RoleMenu.menu(); break;
                case 5: TenantMenu.menu(); break;
                case 6: return;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}
