package exercise_0014;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0014.exercise_0014.longestCommonPrefix;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0014Test {
    static String[] strs1, strs2;

    @BeforeAll
    static void setUp() {
        strs1 = new String[] {"flower","flow","flight"};
        strs2 = new String[] {"dog","racecar","car"};
    }

    @Test
    void testCase1() {
        assertEquals("fl", longestCommonPrefix(strs1));
    }

    @Test
    void testCase2() {
        assertEquals("", longestCommonPrefix(strs2));
    }
}