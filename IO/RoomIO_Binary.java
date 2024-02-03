package IO;

import model.Account;
import model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomIO_Binary {
    static File file = new File("rooms.txt");

    public static void write(List<Room> rooms) {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(rooms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Room> read() {
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Room>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
