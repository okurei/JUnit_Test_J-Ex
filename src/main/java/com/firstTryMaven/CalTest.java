package com.firstTryMaven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "4,5,9",
            "0,0,0"
    })
    public void testParameterizedAdd(int a, int b, int expected){
        Cal cal = new Cal();
        assertEquals(expected, cal.add(a,b));
    }
}
