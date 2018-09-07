import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;


public class IntegerToNumeralTest{

    @Test
    public void TestForOne(){
        assertEquals("I",IntegerToNumeral.Convert(1));

    }

    @Test
    public void TestForTwo(){
        assertEquals("II",IntegerToNumeral.Convert(2));

    }

    @Test
    public void TestForFive(){
        assertEquals("V",IntegerToNumeral.Convert(5));

    }

    @Test
    public void TestForFour(){
        assertEquals("IV",IntegerToNumeral.Convert(4));

    }

    @Test
    public void TestForNine(){
        assertEquals("IX",IntegerToNumeral.Convert(9));

    }

    @Test
    public void TestForTen(){
        assertEquals("X",IntegerToNumeral.Convert(10));

    }

    @Test
    public void TestForFourteen(){
        assertEquals("XIV",IntegerToNumeral.Convert(14));

    }

    @Test
    public void TestForFifteen(){
        assertEquals("XV",IntegerToNumeral.Convert(15));

    }

    @Test
    public void TestForThirtyEight(){
        assertEquals("XXXVIII",IntegerToNumeral.Convert(38));

    }

    @Test
    public void TestForFourty(){
        assertEquals("XL",IntegerToNumeral.Convert(40));

    }

    @Test
    public void TestForFifty(){
        assertEquals("L",IntegerToNumeral.Convert(50));

    }

    @Test
    public void TestForNinety(){
        assertEquals("XC",IntegerToNumeral.Convert(90));

    }

    @Test
    public void TestForOneHundred(){
        assertEquals("C",IntegerToNumeral.Convert(100));

    }

}