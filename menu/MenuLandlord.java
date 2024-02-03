package menu;

import java.util.Scanner;

public class MenuLandlord {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome Landlord!");
            System.out.println("1. Contract menu");
            System.out.println("2. Room menu");
            System.out.println("3. Tenant menu");
            System.out.println("4. Logout");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: ContractMenu.menu(); break;
                case 2: RoomMenu.menu(); break;
                case 3: TenantMenu.menu(); break;
                case 4: return;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}
