import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;


public class IntegerToNumeralTest{

    // Start of general tests
    @Test
    public void TestForOne(){ assertEquals("I",IntegerToNumeral.Convert(1)); }

    @Test
    public void TestForTwo(){ assertEquals("II",IntegerToNumeral.Convert(2)); }

    @Test
    public void TestForFive(){ assertEquals("V",IntegerToNumeral.Convert(5)); }

    @Test
    public void TestForFour(){ assertEquals("IV",IntegerToNumeral.Convert(4)); }

    @Test
    public void TestForNine(){ assertEquals("IX",IntegerToNumeral.Convert(9)); }

    @Test
    public void TestForTen(){ assertEquals("X",IntegerToNumeral.Convert(10)); }

    @Test
    public void TestForFourteen(){ assertEquals("XIV",IntegerToNumeral.Convert(14)); }

    @Test
    public void TestForFifteen(){ assertEquals("XV",IntegerToNumeral.Convert(15)); }

    @Test
    public void TestForThirtyEight(){ assertEquals("XXXVIII",IntegerToNumeral.Convert(38)); }

    @Test
    public void TestForFourty(){ assertEquals("XL",IntegerToNumeral.Convert(40)); }

    @Test
    public void TestForFifty(){ assertEquals("L",IntegerToNumeral.Convert(50)); }

    @Test
    public void TestForNinety(){ assertEquals("XC",IntegerToNumeral.Convert(90)); }

    @Test
    public void TestForOneHundred(){ assertEquals("C",IntegerToNumeral.Convert(100)); }

    @Test
    public void TestForFiveHundred(){ assertEquals("D",IntegerToNumeral.Convert(500)); }

    @Test
    public void TestForFourHundred(){ assertEquals("CD",IntegerToNumeral.Convert(400)); }

    @Test
    public void TestForOneThousand(){ assertEquals("M",IntegerToNumeral.Convert(1000)); }

    @Test
    public void TestForNineHundred(){ assertEquals("DM",IntegerToNumeral.Convert(900)); }
    // End of general tests

    // Start of extreme tests
    @Test
    public void TestForFifteenThousandTwoHundredThirtySeven(){ assertEquals("MMMMMMMMMMMMMMMCCXXXVII",IntegerToNumeral.Convert(15237)); }

    @Test
    public void TestForZero() { assertEquals("There is no value for zero", IntegerToNumeral.Convert(0)); }

    @Test
    public void TestForNegatives() { assertEquals("There are no negative numbers", IntegerToNumeral.Convert(-1000)); }




}