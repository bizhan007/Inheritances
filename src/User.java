public class User {
    protected String name;
    protected String surname;
    protected String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public User(){

    }
    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }


}
