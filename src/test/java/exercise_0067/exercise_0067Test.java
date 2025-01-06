package exercise_0067;

import org.junit.jupiter.api.Test;

import static exercise_0067.exercise_0067.addBinary;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0067Test {

    @Test
    void testCase1() {
        String a = "11";
        String b = "1";

        assertEquals("100", addBinary(a, b));
    }

    @Test
    void testCase2() {
        String a = "1010";
        String b = "1011";

        assertEquals("10101", addBinary(a, b));
    }
}