package menu;

import java.util.Scanner;

public class MenuTenant {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome!");
            System.out.println("1. Room menu");
            System.out.println("2. Logout");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: RoomMenu.menu(); break;
                case 2: return;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}
