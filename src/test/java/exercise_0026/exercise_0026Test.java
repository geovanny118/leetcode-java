package exercise_0026;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static exercise_0026.exercise_0026.removeDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0026Test {
    static int[] nums1, nums2;

    @BeforeAll
    static void setUp() {
        nums1 = new int[]{1,1,2};
        nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
    }

    @Test
    void testCase1() {
        assertEquals(2, removeDuplicates(nums1));
    }

    @Test
    void testCase2() {
        assertEquals(5, removeDuplicates(nums2));
    }
}