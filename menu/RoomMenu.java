package menu;

import src.RoomManager;

import java.util.Scanner;

public class RoomMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        RoomManager roomManager = new RoomManager();
        while (true) {
            System.out.println("Menu: Room");
            System.out.println("1. Display rooms");
            System.out.println("2. Add rooms");
            System.out.println("3. Edit rooms");
            System.out.println("4. Delete rooms");
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
                case 1:
                    roomManager.display();
                    break;
                case 2:
                    roomManager.add(roomManager.create());
                    break;
                case 3:
                    roomManager.edit();
                    break;
                case 4:
                    roomManager.delete();
                    break;
                case 5:
                    roomManager.read();
                    break;
                case 6:
                    roomManager.write();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("wrong choice");
                    break;
            }
        }
    }
}
