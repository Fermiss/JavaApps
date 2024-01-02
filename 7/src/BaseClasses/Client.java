package BaseClasses;

public class Client {
    private int id;
    private String fullName;
    private String address;
    private String passport;
    private String phoneNumber;

    public Client(int id, String fullName, String address, String passport, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.passport = passport;
        this.phoneNumber = phoneNumber;
    }
    public Client(){};
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return id + " " + fullName + " " + address + " " + passport + " " + phoneNumber;
    }
}
