package javastart.hotelBooking;

public class Client {

    private String surname;
    private String name;
    private String phone;
    private String email;
    private Bill bill;

    public Client(String surname, String name, String phone, String email, Bill bill) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.bill = bill;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
