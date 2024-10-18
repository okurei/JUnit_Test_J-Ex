package com.firstTryMaven;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    @Test
    public void testReversed (){
        String in = "anna";
        String out = stringUtil.reverse(in);
        assertEquals(in, out);
        in = "John";
        out = stringUtil.reverse(in);
        assertNotEquals(in, out);
    }
    @Test
    public void testIsPalindrome(){
        String in = "anna";
        assertTrue(stringUtil.isPalindrome(in));
        in = "John";
        assertFalse(stringUtil.isPalindrome(in));
        in = "";
        assertTrue(stringUtil.isPalindrome(in));
        in = null;
        assertFalse(stringUtil.isPalindrome(in));

    }
}
