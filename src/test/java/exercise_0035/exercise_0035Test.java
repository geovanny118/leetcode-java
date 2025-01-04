package exercise_0035;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0035.exercise_0035.searchInsert;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0035Test {
    static int[] nums1, nums2, nums3;
    static int target1, target2, target3;

    @BeforeAll
    static void setup(){
        nums1 = new int[]{1,3,5,6};
        nums2 = new int[]{1,3,5,6};
        nums3 = new int[]{1,3,5,6};
        target1 = 5;
        target2 = 2;
        target3 = 7;
    }

    @Test
    void testCase1(){
        assertEquals(2, searchInsert(nums1, target1));
    }

    @Test
    void testCase2(){
        assertEquals(1, searchInsert(nums2, target2));
    }

    @Test
    void testCase3(){
        assertEquals(4, searchInsert(nums3, target3));
    }
}