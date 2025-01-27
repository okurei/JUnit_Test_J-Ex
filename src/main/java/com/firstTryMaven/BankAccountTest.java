package com.firstTryMaven;

import org.junit.Test;
import static org.junit.Assert.*;


public class BankAccountTest {
    BankAccount bankTest = new BankAccount();

    @Test
    public void testSetBalance(){
        int amount = 1000;
        int balance = bankTest.getBalance();
        bankTest.setBalance(amount);
        assertEquals(balance + amount, bankTest.getBalance() );
        amount = -1000;
        balance= bankTest.getBalance();
        bankTest.setBalance(amount);
        assertEquals(balance + amount, bankTest.getBalance());
    }

    @Test
    public void testWithdraw() throws InsufficientFoundsException {
        int amount = 1000;
        int balance = bankTest.getBalance();
        assertThrows(InsufficientFoundsException.class,()-> bankTest.withdraw(100000));
        bankTest.withdraw(amount);
        assertEquals(balance - amount, bankTest.getBalance());
    }

    @Test
    public void testDeposit(){
        int amount = 0;
        int balance = bankTest.getBalance();
        bankTest.deposit(amount);
        assertEquals(amount+balance,bankTest.getBalance());
    }
}
