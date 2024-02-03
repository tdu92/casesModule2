package IO;

import model.Account;
import model.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContractIO_Binary {
    static File file = new File("contract.txt");

    public static void write(List<Contract> contracts) {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(contracts);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Contract> read() {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Contract>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
