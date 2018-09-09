import org.junit.Test;
import static org.junit.Assert.*;
public class NumeralToIntegerTest {
    // General tests
    @Test
    public void BasicTest(){
        assertEquals(10, numeralToInteger.numeralToInteger("X"));
    }

    // Extreme testing & cases
    @Test
    public void ExtremeTest(){
        assertEquals(3999, numeralToInteger.numeralToInteger("MMMCMXCIX"));
    }

    @Test
    public void caseSensitivityTest(){ assertEquals(3999, numeralToInteger.numeralToInteger("mmmcmxcix")); }

    @Test
    public void caseSensitivityTest2(){ assertEquals(3999, numeralToInteger.numeralToInteger("mMmCmXcIx")); }

    // Testing for Spaces in the input & lack of input
    @Test
    public void TestForSpaces() { assertEquals(11, numeralToInteger.numeralToInteger("X I")); }

    @Test
    public void TestForSpaces2() { assertEquals(999, numeralToInteger.numeralToInteger(" CM   XC IX")); }

    @Test
    public void TestForSpaceOnly() { assertEquals( 0, numeralToInteger.numeralToInteger(" ")); }

    // Test currently throwing indexing error
    @Test
    public void noEntryTest(){ assertEquals( -1, numeralToInteger.numeralToInteger("")); }
}
