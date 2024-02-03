import menu.MenuAdmin;
import menu.MenuLandlord;
import menu.MenuTenant;
import model.Account;
import src.AccountManager;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static AccountManager accountManager = new AccountManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n -WELCOME TO MINI APARTMENT MANAGER PROGRAM- \n");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    public static void login() {
        System.out.println("enter account name");
        String name = scanner.nextLine();
        System.out.println("enter password");
        String password = scanner.nextLine();
        Account account = accountManager.checkLogin(name, password);
        if (account != null) {
            System.out.println("\n -LOGIN SUCCESS!- \n");
            if (account.getRole().getRoleName().equals("Administrator")) {
                MenuAdmin.menu();
            }
            if (account.getRole().getRoleName().equals("Landlord")) {
                MenuLandlord.menu();
            }
            if (account.getRole().getRoleName().equals("Tenant")) {
                MenuTenant.menu();
            }
        } else {
            System.out.println("- LOGIN FAILED!\n");
        }
    }
}