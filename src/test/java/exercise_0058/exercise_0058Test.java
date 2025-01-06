package exercise_0058;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0058.exercise_0058.lengthOfLastWord;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0058Test {
    static String s1, s2, s3;

    @BeforeAll
    static void setup(){
        s1 = "Hello World";
        s2 = "   fly me   to   the moon  ";
        s3 = "luffy is still joyboy";
    }

    @Test
    void testCas1() {
        assertEquals(5, lengthOfLastWord(s1));
    }

    @Test
    void testCas2() {
        assertEquals(4, lengthOfLastWord(s2));
    }

    @Test
    void testCas3() {
        assertEquals(6, lengthOfLastWord(s3));
    }
}