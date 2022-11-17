import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {
    @Test
    public void testRomanBasicM(){
        int actual= RomanToInt.convertRomanToInt("M");
        Assertions.assertEquals(1000,actual);
    }
    @Test
    public void testRomanBasicD(){
        int actual= RomanToInt.convertRomanToInt("D");
        Assertions.assertEquals(500,actual);
    }
    @Test
    public void testRomanBasicC(){
        int actual= RomanToInt.convertRomanToInt("C");
        Assertions.assertEquals(100,actual);
    }
    @Test
    public void testRomanBasicL(){
        int actual= RomanToInt.convertRomanToInt("L");
        Assertions.assertEquals(50,actual);
    }
    @Test
    public void testRomanBasicX(){
        int actual= RomanToInt.convertRomanToInt("X");
        Assertions.assertEquals(10,actual);
    }
    @Test
    public void testRomanBasicV(){
        int actual= RomanToInt.convertRomanToInt("V");
        Assertions.assertEquals(5,actual);
    }
    @Test
    public void testRomanBasicI(){
        int actual= RomanToInt.convertRomanToInt("I");
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void testRomanIV(){
        int actual= RomanToInt.convertRomanToInt("IV");
        Assertions.assertEquals(4,actual);
    }
    @Test
    public void testRomanComplex(){
        int actual = RomanToInt.convertRomanToInt("MMCMXCIX");
        Assertions.assertEquals(2999, actual);
    }
}
