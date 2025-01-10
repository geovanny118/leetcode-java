package exercise_0088;

import org.junit.jupiter.api.Test;

import static exercise_0088.exercise_0088.merge;
import static org.junit.jupiter.api.Assertions.*;

class exercise_0088Test {
    @Test
    void testCase1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        int[] answer = {1,2,2,3,5,6};
        merge(nums1, m, nums2, n);

        assertArrayEquals(answer, nums1);
    }

    @Test
    void testCase2() {
        int[] nums1 = {1};
        int[] nums2 = null;
        int m = 1, n = 0;
        int[] answer = {1};
        merge(nums1, m, nums2, n);

        assertArrayEquals(answer, nums1);

    }

    @Test
    void testCase3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        int[] answer = {1};
        merge(nums1, m, nums2, n);

        assertArrayEquals(answer, nums1);
    }
}