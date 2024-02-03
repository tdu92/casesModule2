package validate;

import model.Account;

import java.util.List;
import java.util.Scanner;

public class AccountValidate {
    static Scanner scanner = new Scanner(System.in);
    public static String accountName (List<Account> accounts){
        while (true) {
            System.out.println("enter name");
            String name = scanner.nextLine();
            boolean check = true;
            for (Account a : accounts) {
                if (a.getAccountName().equals(name)){
                    System.out.println("name existed, retry");
                    check = false;
                    break;
                }
            }
            if (check) {return name;}
        }
    }

    public static String password(){
        while (true) {
            System.out.println("enter password");
            String password = scanner.nextLine();
            System.out.println("enter password again");
            String repassword = scanner.nextLine();
            if (password.equals(repassword)){
                return password;
            } else {
                System.out.println("not match, retry");
            }
        }
    }
}
