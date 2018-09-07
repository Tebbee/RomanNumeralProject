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

}