package assigments.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {

    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < good.length; i = i + 1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < not_good.length; i = i + 1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }

    @Test
    void int2NumberTest() {
        assertEquals("101b2", Ex1.int2Number(5, 2));
        assertEquals("", Ex1.int2Number(-123, 8));
        assertEquals("", Ex1.int2Number(19, 20));
        assertEquals("0", Ex1.int2Number(0, 5));

    }

    @Test
    void maxIndexTest() {
        String[] arr = {"123", "414", "14144", "0", "33", "9000"};
        String[] arr1 = null;
        String[] arr2 = {};
        assertEquals(2, Ex1.maxIndex(arr));
        assertEquals(-1, Ex1.maxIndex(arr1));
        assertEquals(-1, Ex1.maxIndex(arr2));

    }

    //   Add additional test functions - test as much as you can. - ok:)
    // test equals + number2Int
    @Test
    void equalsTest() {
        assertFalse(Ex1.equals("null", "null"));
        assertFalse(Ex1.equals("8", "9"));
        assertFalse(Ex1.equals("15.8", "15"));
        assertFalse(Ex1.equals("B", "B"));
    }
    @Test
     void number2intTest(){
        assertEquals(123, Ex1.number2Int("123"));
        assertEquals(-1, Ex1.number2Int("c"));
        assertEquals(3,Ex1.number2Int("3"));
        assertEquals(1,Ex1.number2Int("1b3"));
    }


}
