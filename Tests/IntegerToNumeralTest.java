import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;


public class IntegerToNumeralTest{

    @Test
    public void TestForOne(){
        assertEquals("I",IntegerToNumeral.ConvertNumber(1));

    }

    @Test
    public void TestForTwo(){
        assertEquals("II",IntegerToNumeral.ConvertNumber(2));

    }

    @Test
    public void TestForFive(){
        assertEquals("V",IntegerToNumeral.ConvertNumber(5));

    }

    @Test
    public void TestForFour(){
        assertEquals("IV",IntegerToNumeral.ConvertNumber(4));

    }

    @Test
    public void TestForNine(){
        assertEquals("IX",IntegerToNumeral.ConvertNumber(9));

    }

    @Test
    public void TestForTen(){
        assertEquals("X",IntegerToNumeral.ConvertNumber(10));

    }

    @Test
    public void TestForFourteen(){
        assertEquals("XIV",IntegerToNumeral.ConvertNumber(14));

    }

    @Test
    public void TestForFifteen(){
        assertEquals("XV",IntegerToNumeral.ConvertNumber(15));

    }

    @Test
    public void TestForThirtyEight(){
        assertEquals("XXXVIII",IntegerToNumeral.ConvertNumber(38));

    }

    @Test
    public void TestForFourty(){
        assertEquals("XL",IntegerToNumeral.ConvertNumber(40));

    }

    @Test
    public void TestForFifty(){
        assertEquals("L",IntegerToNumeral.ConvertNumber(50));

    }

    @Test
    public void TestForNinety(){
        assertEquals("XC",IntegerToNumeral.ConvertNumber(90));

    }

    @Test
    public void TestForOneHundred(){
        assertEquals("C",IntegerToNumeral.ConvertNumber(100));

    }

    @Test
    public void TestForFiveHundred(){
        assertEquals("D",IntegerToNumeral.ConvertNumber(500));

    }

    @Test
    public void TestForFourHundred(){
        assertEquals("CD",IntegerToNumeral.ConvertNumber(400));

    }

    @Test
    public void TestForOneThousand(){
        assertEquals("M",IntegerToNumeral.ConvertNumber(1000));

    }

    @Test
    public void TestForNineHundred(){
        assertEquals("DM",IntegerToNumeral.ConvertNumber(900));

    }

    @Test
    public void TestForFifteenThousandTwoHundredThirtySeven(){
        assertEquals("MMMMMMMMMMMMMMMCCXXXVII",IntegerToNumeral.ConvertNumber(15237));

    }



}