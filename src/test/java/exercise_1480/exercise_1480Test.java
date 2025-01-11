package exercise_1480;

import org.junit.jupiter.api.Test;

import static exercise_1480.exercise_1480.runningSum;
import static org.junit.jupiter.api.Assertions.*;

class exercise_1480Test {
    @Test
    void testCase1(){
        int[] nums = new int[] {1,2,3,4};
        int[] answer = new int[] {1,3,6,10};

        assertArrayEquals(answer, runningSum(nums));
    }

    @Test
    void testCase2(){
        int[] nums = new int[] {1,1,1,1,1};
        int[] answer = new int[] {1,2,3,4,5};

        assertArrayEquals(answer, runningSum(nums));
    }

    @Test
    void testCase3(){
        int[] nums = new int[] {3,1,2,10,1};
        int[] answer = new int[] {3,4,6,16,17};

        assertArrayEquals(answer, runningSum(nums));
    }
}