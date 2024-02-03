package IO;

import model.Account;
import model.Tenant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TenantIO_Binary {
    static File file = new File("tenants.txt");

    public static void write(List<Tenant> tenants) {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(tenants);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Tenant> read() {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Tenant>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
