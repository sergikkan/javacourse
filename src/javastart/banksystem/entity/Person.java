package javastart.banksystem.entity;

public class Person {

    private String surname;
    private String name;
    private String phoneNumber;

    public Person(String surname, String name, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
