package model;

public class Tenant {
    private static int idStatic = 1;
    private int id;
    private String tenantName;
    private int YearOfBirth;

    public Tenant() {
        this.id = idStatic++;
    }

    public Tenant(String tenantName, int YearOfBirth) {
        this.id = idStatic++;
        this.tenantName = tenantName;
        this.YearOfBirth = YearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return id + "," + tenantName + "," + YearOfBirth;
    }
}
