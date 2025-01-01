package exercise_0009;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static exercise_0009.exercise_0009.IsPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0009Test {

    @Nested
    class IsPalindrome {
        int number_1 = 121;
        int number_2 = 11;

        @Test
        void testCase1() {
            assertTrue(IsPalindrome(number_1));
        }

        @Test
        void testCase2() {
            assertTrue(IsPalindrome(number_2));
        }
    }

    @Nested
    class IsNotPalindrome {
        int number_1 = -121;
        int number_2 = 10;

        @Test
        void testCase1() {
            assertFalse(IsPalindrome(number_1));
        }

        @Test
        void testCase2() {
            assertFalse(IsPalindrome(number_2));
        }
    }
}