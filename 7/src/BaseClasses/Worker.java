package BaseClasses;

public class Worker {
    private int id;
    private String fullName;
    private int age;
    private String sex;
    private String address;
    private String phoneNumber;
    private String passport;
    private int position_id;

    public Worker(int id, String fullName, int age, String sex, String address, String phoneNumber, String passport, int position_id) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.passport = passport;
        this.position_id = position_id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    @Override
    public String toString(){
        return id + " " + fullName + " " + age + " " + sex + " " + address + " " + phoneNumber + " " + passport + " " + position_id;
    }
}
