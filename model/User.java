package model;

public class User extends Orang {
    private String password;
    private String role; // ADMIN atau USER

    public User(String username, String password, String role) {
        super(username); // pakai field name dari Person
        this.password = password;
        this.role = role.toUpperCase();
    }

    public String getUsername() { return name; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User{" + "username='" + name + "', role='" + role + "'}";
    }
}
