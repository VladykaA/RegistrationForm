package MVC.Model.User;

public class User {

    private String firstName;
    private String lastName;
    private String middleName;
    private String login;
    private String comment;
    private String group;
    private String phoneNumberHome;
    private String phoneNumberMob;
    private String phoneNumberMob2;
    private String email;
    private String skype;
    private Address address;
    private String dateOfCreation;
    private String dateOfUpdate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberMob() {
        return phoneNumberMob;
    }

    public void setPhoneNumberMob(String phoneNumberMob) {
        this.phoneNumberMob = phoneNumberMob;
    }

    public String getPhoneNumberMob2() {
        return phoneNumberMob2;
    }

    public void setPhoneNumberMob2(String phoneNumberMob2) {
        this.phoneNumberMob2 = phoneNumberMob2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDateOfUpdate() {
        return dateOfUpdate;
    }

    public void setDateOfUpdate(String dateOfUpdate) {
        this.dateOfUpdate = dateOfUpdate;
    }
}
