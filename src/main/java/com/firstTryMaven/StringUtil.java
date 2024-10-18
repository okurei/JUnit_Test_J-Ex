package com.firstTryMaven;

public class StringUtil {
    public boolean isPalindrome (String str){
        str = str != null? str : "empty";
        String reversed =reverse(str);
        return str.equals(reversed);
    }
    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
