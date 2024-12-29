package exercise_0003;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0003.exercise_0003.lengthOfLongestSubstring;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0003Test {

    static String s1, s2, s3, s4, s5;

    @BeforeAll
    static void setupInstance(){
        s1 = "abcabcbb";
        s2 = "bbbbb";
        s3 = "pwwkew";
        s4 = "aab";
        s5 = "dvdf";
    }

    @Test
    void testCase1() {
        assertEquals(3, lengthOfLongestSubstring(s1));
    }

    @Test
    void testCase2() {
        assertEquals(1, lengthOfLongestSubstring(s2));
    }

    @Test
    void testCase3() {
        assertEquals(3, lengthOfLongestSubstring(s3));
    }

    @Test
    void testCase4() {
        assertEquals(2, lengthOfLongestSubstring(s4));
    }

    @Test
    void testCase5() {
        assertEquals(3, lengthOfLongestSubstring(s5));
    }
}