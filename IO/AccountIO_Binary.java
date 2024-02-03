package IO;

import model.Account;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AccountIO_Binary {
    static File file = new File("accounts.txt");

    public static void write(List<Account> accounts) {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(accounts);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Account> read() {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Account>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
