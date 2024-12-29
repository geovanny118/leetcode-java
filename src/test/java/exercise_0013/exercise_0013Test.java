package exercise_0013;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0013.exercise_0013.RomanToInt;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0013Test {
    static String s1, s2, s3;

    @BeforeAll
    static void setUp() {
        s1 = "III";
        s2 = "LVIII";
        s3 = "MCMXCIV";
    }

    @Test
    void testCase1() {
        assertEquals(3, RomanToInt(s1));
    }

    @Test
    void testCase2() {
        assertEquals(58, RomanToInt(s2));
    }

    @Test
    void testCase3() {
        assertEquals(1994, RomanToInt(s3));
    }
}