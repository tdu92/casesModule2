package menu;

import src.AccountManager;
import src.ContractManager;

import java.util.Scanner;

public class ContractMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ContractManager contractManager = new ContractManager();
        while (true) {
            System.out.println("Menu: Contract");
            System.out.println("1. Display Contract");
            System.out.println("2. Add Contract");
            System.out.println("3. Edit Contract");
            System.out.println("4. Delete Contract");
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
                case 1: contractManager.display(); break;
                case 2: contractManager.add(contractManager.create()); break;
                case 3: contractManager.edit(); break;
                case 4: contractManager.delete(); break;
                case 5: contractManager.read(); break;
                case 6: contractManager.write(); break;
                case 7: return;
                default:
                    System.out.println("wrong choice"); break;
            }
        }
    }
}