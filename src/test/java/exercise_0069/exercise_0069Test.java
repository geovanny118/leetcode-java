package exercise_0069;

import org.junit.jupiter.api.Test;

import static exercise_0069.exercise_0069.mySqrt;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0069Test {

    @Test
    void testCase1() {
        int x = 4;
        assertEquals(2, mySqrt(x));
    }

    @Test
    void testCase2() {
        int x = 8;
        assertEquals(2, mySqrt(x));
    }
}