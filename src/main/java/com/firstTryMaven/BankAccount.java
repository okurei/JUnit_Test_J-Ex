package com.firstTryMaven;

import lombok.Getter;

@Getter
public class BankAccount {
    private int balance = 10000;

    public void setBalance(int money){
        this.balance = balance + money;
    }
    public void withdraw(int amount) throws ArithmeticException {
        if (balance < amount) {
            throw new ArithmeticException("Insufficient founds for a withdraw");
        }else{
            setBalance(-amount);
        }
    }
    public void deposit(int amount){
        setBalance(amount);
    }

}
