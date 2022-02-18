package javastart.banksystem;

import javastart.banksystem.entity.Account;
import javastart.banksystem.entity.Bill;
import javastart.banksystem.entity.Person;
import javastart.banksystem.service.DepositService;
import javastart.banksystem.service.PaymentService;
import javastart.banksystem.service.TransferService;

public class Main {

    public static void main(String[] args) {
        Person serhiiPerson = new Person("Kan", "Serhii", "+77758672101");
        Bill serhiiBill = new Bill(10000);
        Account serhiiAccount = new Account(serhiiPerson, serhiiBill);

        Person anastasiyaPerson = new Person("Em", "Anastasiya", "+77772334567");
        Bill anastasiyaBill = new Bill(8000);
        Account anastasiyaAccount = new Account(anastasiyaPerson, anastasiyaBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(serhiiAccount, 1000);
        paymentService.pay(anastasiyaAccount, 1500);

        DepositService depositService = new DepositService();
        depositService.deposit(serhiiAccount, 4000);
        depositService.deposit(anastasiyaAccount, 2300);

        TransferService transferService = new TransferService();
        transferService.transfer(serhiiAccount, anastasiyaAccount, 300);
    }
}
