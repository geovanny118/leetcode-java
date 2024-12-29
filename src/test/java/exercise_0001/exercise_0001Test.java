package exercise_0001;

import org.junit.jupiter.api.Test;

import static exercise_0001.exercise_0001.TwoSum;
import static org.junit.jupiter.api.Assertions.*; //import methods as is....all methods will be available within the class

class exercise_0001Test {

    @Test
    void testCase1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        assertArrayEquals(new int[] { 0, 1 }, TwoSum(nums, target));
    }

    @Test
    void testCase2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        assertArrayEquals(new int[] { 1, 2 }, TwoSum(nums, target));
    }

    @Test
    void testCase3() {
        int[] nums = { 3, 3 };
        int target = 6;

        assertArrayEquals(new int[] { 0, 1 }, TwoSum(nums, target));
    }
}