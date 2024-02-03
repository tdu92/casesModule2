package IO;

import model.Account;
import model.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoleIO_Binary {
    static File file = new File("roles.txt");

    public static void write(List<Role> roles) {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(roles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Role> read() {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Role>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
