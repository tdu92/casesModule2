package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Manager<E> {
    public List<E> elements = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add(E e) {
        elements.add(e);
    }

    public void display() {
        for (E e : elements) {
            System.out.println(e);
        }
    }
    public abstract void edit();

    public abstract void delete();

    public abstract void write();

    public abstract void read();
}
