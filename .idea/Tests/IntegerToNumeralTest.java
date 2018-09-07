import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;


public class IntegerToNumeralTest{

    @Test
    public void TestForOne(){
        int input = 1;
        assertEquals("I",IntegerToNumeral.Convert(1));

    }

}