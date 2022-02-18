package javastart.banksystem.service;

import javastart.banksystem.entity.Account;
import javastart.banksystem.entity.Bill;

public class DepositService {

    public void deposit(Account account, int amount){
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнения счета, текущее значение счета "+ currentBillAmount);
        bill.setAmount(currentBillAmount+amount);
        System.out.println("Пополнение счета прошло успешно, новое значение счета: " + bill.getAmount());
    }
}
