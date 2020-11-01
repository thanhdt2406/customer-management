package model;

public class Customer {
    private int ID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Customer(){

    }

    public Customer(int ID, String firstName, String lastName, String phoneNumber, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Customer(String firstName, String lastName, String phoneNumber, String address) {
        this.ID = DBUtils.ID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
