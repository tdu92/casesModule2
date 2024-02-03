package menu;

import src.TenantManager;

import java.util.Scanner;

public class TenantMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        TenantManager tenantManager = new TenantManager();
        while (true) {
            System.out.println("Menu: Tenant");
            System.out.println("1. Display tenants");
            System.out.println("2. Add tenants");
            System.out.println("3. Edit tenants");
            System.out.println("4. Delete tenants");
            System.out.println("5. Read from file");
            System.out.println("6. Write to file");
            System.out.println("7. Exit");
            int choice;
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
                    tenantManager.display();
                    break;
                case 2:
                    tenantManager.add(tenantManager.create());
                    break;
                case 3:
                    tenantManager.edit();
                    break;
                case 4:
                    tenantManager.delete();
                    break;
                case 5:
                    tenantManager.read();
                    break;
                case 6:
                    tenantManager.write();
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
