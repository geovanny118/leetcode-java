package exercise_0003;

import org.junit.jupiter.api.Test;

import static exercise_0003.exercise_0003.lengthOfLongestSubstring;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0003Test {

    @Test
    void testCase1() {
        String s = "abcabcbb";

        assertEquals(3, lengthOfLongestSubstring(s));
    }

    @Test
    void testCase2() {
        String s = "bbbbb";

        assertEquals(1, lengthOfLongestSubstring(s));
    }

    @Test
    void testCase3() {
        String s = "pwwkew";

        assertEquals(3, lengthOfLongestSubstring(s));
    }

    @Test
    void testCase4() {
        String s = "aab";

        assertEquals(2, lengthOfLongestSubstring(s));
    }
}