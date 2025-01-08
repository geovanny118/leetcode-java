package exercise_0070;

import org.junit.jupiter.api.Test;

import static exercise_0070.exercise_0070.climbStairs;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0070Test {
    @Test
    void testCase1(){
        assertEquals(2, climbStairs(2));
    }

    @Test
    void testCase2(){
        assertEquals(3, climbStairs(3));
    }
}