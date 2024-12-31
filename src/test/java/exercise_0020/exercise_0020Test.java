package exercise_0020;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0020.exercise_0020.isValid;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0020Test {
    static String s1, s2, s3, s4;

    @BeforeAll
    static void setUp() {
        s1 = "()";
        s2 = "()[]{}";
        s3 = "(]";
        s4 = "([])";
    }

    @Test
    void testCase1() {
        assertTrue(isValid(s1));
    }

    @Test
    void testCase2() {
        assertTrue(isValid(s2));
    }

    @Test
    void testCase3() {
        assertFalse(isValid(s3));
    }

    @Test
    void testCase4() {
        assertTrue(isValid(s4));
    }
}