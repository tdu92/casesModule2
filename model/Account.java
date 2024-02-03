package model;

public class Account {
    private int id;
    private static int idStatic =0;
    private String accountName;
    private String password;
    private Role role;
    public Account(){
        this.id = idStatic++;
    }

    public Account(String accountName, String password, Role role) {
        this.id = idStatic++;
        this.accountName = accountName;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return id + "," + accountName +"," + password +"," + role;
    }
}
