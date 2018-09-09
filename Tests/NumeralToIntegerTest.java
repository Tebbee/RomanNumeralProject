import org.junit.Test;
import static org.junit.Assert.*;
public class NumeralToIntegerTest {
    @Test
    public void BasicTest(){
        assertEquals(10, numeralToInteger.numeralToInteger("X"));
    }
    @Test
    public void ExtremeTest(){
        assertEquals(3999, numeralToInteger.numeralToInteger("MMMCMXCIX"));
    }
    @Test
    public void noEntryTest(){
        assertEquals(-1, numeralToInteger.numeralToInteger(" "));
    }
    @Test
    public void caseSensitivityTest(){
        assertEquals(3999, numeralToInteger.numeralToInteger("mmmcmxcix"));
    }
}
