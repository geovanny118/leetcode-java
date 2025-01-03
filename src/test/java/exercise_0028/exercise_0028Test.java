package exercise_0028;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0028.exercise_0028.strStr;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0028Test {
    static String haystack_1, needle_1, haystack_2, needle_2;

    @BeforeAll
    static void setup(){
        haystack_1 = "sadbutsad";
        needle_1 = "sad";
        haystack_2 = "leetcode";
        needle_2 = "leeto";
    }

    @Test
    void testCase1() {
        assertEquals(0, strStr(haystack_1, needle_1));
    }

    @Test
    void testCase2() {
        assertEquals(-1, strStr(haystack_2, needle_2));
    }
}