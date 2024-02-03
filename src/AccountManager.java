package src;

import IO.AccountIO_Binary;
import model.Account;
import model.Role;
import validate.AccountValidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager extends Manager<Account> {
    ArrayList<Role> roles = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public AccountManager(){
        roles.add(new Role(1,"Administrator"));
        roles.add(new Role(2, "Landlord"));
        roles.add(new Role(3,"Tenant"));
        accounts.add(new Account("Admin","123",roles.get(0)));
    }
public void display(){
        for (Account a : accounts){
            System.out.println(a.getId() + "-" + a.getAccountName() + "-" + a.getRole().getRoleName());
        }
}
    public Role choiceRole() {
        System.out.println("List of roles");
        for (int i = 0; i < roles.size(); i++) {
            System.out.println(i + 1 + "," + roles.get(i).getRoleName());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        return roles.get(choice - 1);
    }

    public Account create() {
        String name = AccountValidate.accountName(accounts);
        String password = AccountValidate.password();
        Role role = choiceRole();
        return new Account(name, password, role);

    }
    public void add(Account account){accounts.add(account);}
    public int findIndexByName(String name) {
        for (int i=0; i<accounts.size(); i++) {
            if (accounts.get(i).getAccountName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public void edit(){
        try {
            System.out.println("enter account name to edit");
            String nameToEdit = scanner.nextLine();
            int index = findIndexByName(nameToEdit);
            if (index != -1) {
                accounts.set(index, create());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(){
        try {
            System.out.println("enter account name to delete");
            String nameToDelete = scanner.nextLine();
            int index = findIndexByName(nameToDelete);
            if (index != -1) {
                accounts.remove(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void read(){
        accounts = AccountIO_Binary.read();
    }
    public void write(){
        AccountIO_Binary.write(accounts);
    }

    public Account checkLogin(String name, String password) {
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getAccountName().equals(name)
                && accounts.get(i).getPassword().equals(password)){
                return accounts.get(i);
            }
        }
        return null;
    }
}
