package com.firstTryMaven;

public class Calculator {
    public int add (int a, int b){
        return a+b;
    }
    public int subtract (int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide (int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Cannot divide by 0");
        }else {
            return a/b;
        }
    }
}
