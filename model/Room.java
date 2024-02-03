package model;

public class Room {
    private int id;
    private double area;
    private double price;

    public Room(){};

    public Room(int id, double area, double price) {
        this.id = id;
        this.area = area;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "," + area + "," + price;
    }
}
