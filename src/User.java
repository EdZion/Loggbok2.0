public class User {
    private String name;
    private String lastname;
    private String user;

    public User(String name, String lastname, String user) {
        this.name = name;
        this.lastname = lastname;
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUser() {
        return user;
    }
}
