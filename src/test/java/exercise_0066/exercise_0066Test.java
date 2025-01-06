package exercise_0066;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0066.exercise_0066.plusOne;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0066Test {
    static int[] digists1, digists2, digists3;

    @BeforeAll
    static void setup(){
        digists1 = new int[]{1,2,3};
        digists2 = new int[]{4,3,2,1};
        digists3 = new int[]{9};
    }

    @Test
    void testCase1(){
        assertArrayEquals(new int[]{1,2,4}, plusOne(digists1));
    }

    @Test
    void testCase2(){
        assertArrayEquals(new int[]{4,3,2,2}, plusOne(digists2));
    }

    @Test
    void testCase3(){
        assertArrayEquals(new int[]{1,0}, plusOne(digists3));
    }
}