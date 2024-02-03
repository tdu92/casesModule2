package model;

public class Contract {
    private int id;
    private static int idStatic = 0;
    private String date;
    private Tenant tenant;
    private Room room;
    public Contract(){
        this.id = idStatic++;
    }

    public Contract(String date, Tenant tenant, Room room) {
        this.id = idStatic++;
        this.date = date;
        this.tenant = tenant;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return id + "," + date + "," + tenant + "," + room;
    }
}
