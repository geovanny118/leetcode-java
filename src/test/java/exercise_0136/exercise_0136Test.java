package exercise_0136;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0136.exercise_0136.singleNumber;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0136Test {
    static int[] nums1, nums2, nums3;

    @BeforeAll
    static void setUp() {
        nums1 = new int[]{2,2,1};
        nums2 = new int[]{4,1,2,1,2};
        nums3 = new int[]{1};
    }

    @Test
    void testCase1() {
        assertEquals(1, singleNumber(nums1));
    }

    @Test
    void testCase2() {
        assertEquals(4, singleNumber(nums2));
    }

    @Test
    void testCase3() {
        assertEquals(1, singleNumber(nums3));
    }
}