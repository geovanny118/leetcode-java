package exercise_0027;

import org.junit.jupiter.api.Test;

import static exercise_0027.exercise_0027.removeElement;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0027Test {

    @Test
    void testCase1() {
        int[] nums = {3,2,2,3};
        int val = 3;

        assertEquals(2, removeElement(nums, val));
    }

    @Test
    void testCase2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        assertEquals(5, removeElement(nums, val));
    }
}