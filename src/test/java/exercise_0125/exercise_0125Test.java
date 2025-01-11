package exercise_0125;

import org.junit.jupiter.api.Test;

import static exercise_0125.exercise_0125.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0125Test {
    @Test
    void testCase1(){
        String s = "A man, a plan, a canal: Panama";
        assertTrue(isPalindrome(s));
    }

    @Test
    void testCase2(){
        String s = "race a car";
        assertFalse(isPalindrome(s));
    }

    @Test
    void testCase3(){
        String s = " ";
        assertTrue(isPalindrome(s));
    }
}