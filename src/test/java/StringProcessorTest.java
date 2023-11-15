import org.example.StringProcessor;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void testIsStrongPassword(){
        assertTrue(StringProcessor.isStrongPassword("Azanov$$2004"));
        assertTrue(StringProcessor.isStrongPassword("AdiBro@5312"));
        assertTrue(StringProcessor.isStrongPassword("azarFT.34"));
        assertTrue(StringProcessor.isStrongPassword("France@Gerom82"));
        assertTrue(StringProcessor.isStrongPassword("5Musketer$$"));
    }

    @Test
    public void testCalculateDigits(){
        StringProcessor check = new StringProcessor();
        assertEquals(5,check.calculateDigits("asdd65sfdg7s5gd9"));
        assertEquals(7,check.calculateDigits("bgd7f89sa8fguro948"));
        assertEquals(12,check.calculateDigits("3j0jsg0498wyh349823nsdkgj"));
        assertEquals(15,check.calculateDigits("1-2-12-12-23-423-4353"));
        assertEquals(10,check.calculateDigits("1234567hjk89jdfklgf0"));
    }

    @Test
    public void testCalculateWords(){
        StringProcessor check = new StringProcessor();
        assertEquals(9,check.calculateWords("my name is argen and i am from kyrgyzstan"));
        assertEquals(5,check.calculateWords("Jazz echoes through moonlit streets"));
        assertEquals(0,check.calculateWords(""));
        assertEquals(11,check.calculateWords("Beneath the starry sky, whispers of forgotten tales linger in silence"));
        assertEquals(10,check.calculateWords("Raindrops dance on window panes, a soothing lullaby at dusk"));
    }

    @Test
    public void testCalculateExpression(){
        StringProcessor check = new StringProcessor();
        assertEquals(-27.5, check.calculateExpression("-55.0/2.0"), 0.1);
        assertEquals(-17.6, check.calculateExpression("-88.0/5.0"), 0.1);
        assertEquals(10.0, check.calculateExpression("20.0/2.0"), 0.1);
        assertEquals(15.3, check.calculateExpression("30.6/2.0"), 0.1);
        assertEquals(0.0, check.calculateExpression("0.0/5.0"), 0.1);
    }

}
