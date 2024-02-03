package menu;

import model.Account;
import src.AccountManager;

import java.util.Scanner;

public class AccountMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();
        while (true) {
            System.out.println("Menu: Account");
            System.out.println("1. Display Account");
            System.out.println("2. Add Account");
            System.out.println("3. Edit Account");
            System.out.println("4. Delete Account");
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
                case 1: accountManager.display(); break;
                case 2: accountManager.add(accountManager.create()); break;
                case 3: accountManager.edit(); break;
                case 4: accountManager.delete(); break;
                case 5: accountManager.read(); break;
                case 6: accountManager.write(); break;
                case 7: return;
                default:
                    System.out.println("wrong choice"); break;
            }
        }
    }
}
