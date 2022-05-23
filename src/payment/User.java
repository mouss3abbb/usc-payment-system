package payment;

import java.util.Scanner;

public abstract class User {
    private static int currentID = 0;
    private int ID;
    private String name;
    private String email;
    private String phoneNumber;
    private double age;
    public static Scanner sc = new Scanner(System.in);
    public User(String name,double age,String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.ID = currentID++;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    abstract public void userOperations();
    abstract public void printUser();
}
