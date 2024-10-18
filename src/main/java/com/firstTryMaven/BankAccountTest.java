package com.firstTryMaven;

import org.junit.Test;
import static org.junit.Assert.*;


public class BankAccountTest {
    BankAccount test = new BankAccount();

    @Test
    public void testSetBalance(){
        int amount = 1000;
        int balance = test.getBalance();
        test.setBalance(amount);
        assertEquals(test.getBalance(), balance + amount );
        amount = -1000;
        balance= test.getBalance();
        test.setBalance(amount);
        assertEquals(test.getBalance(), amount+balance);
    }
}
