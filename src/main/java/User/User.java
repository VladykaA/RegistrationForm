package User;

public class User {
    private String loginName;
    private String lastName;

    public User(String loginName, String lastName) {
        this.loginName = loginName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
