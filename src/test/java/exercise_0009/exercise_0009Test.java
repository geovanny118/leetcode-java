package exercise_0009;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0009.exercise_0009.IsPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0009Test {
    static int number_1, number_2, number_3;

    @BeforeAll
    static void setUp() {
        number_1 = 121;
        number_2 = -121;
        number_3 = 10;
    }

    @Test
    void testCase1() {
        assertTrue(IsPalindrome(number_1));
    }

    @Test
    void testCase2() {
        assertFalse(IsPalindrome(number_2));
    }

    @Test
    void testCase3() {
        assertFalse(IsPalindrome(number_2));
    }
}