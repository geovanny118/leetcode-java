package exercise_0136;

import java.util.HashMap;
import java.util.Map;

public class exercise_0136 {
    /*
    * 136. Single Number
    *
    * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    * You must implement a solution with a linear runtime complexity and use only constant extra space
    *
    * Example 1:
    *Input: nums = [2,2,1]
    *Output: 1
    *Example 2:
    *
    *Input: nums = [4,1,2,1,2]
    *Output: 4
    *Example 3:
    *
    *Input: nums = [1]
    *Output: 1
    *
    */

    public static void main(String[] args) {
        System.out.println("Exercise 136");
        int[] example1 = { 2,2,1 };
        int[] example2 = { 4,1,2,1,2 };
        int[] example3 = { 1 };
        System.out.println(singleNumber(example1));
        System.out.println(singleNumber(example2));
        System.out.println(singleNumber(example3));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> dictionary = new HashMap<>();

        // Fill the dictionary with the frequency of each number in nums
        for (int num : nums) {
            dictionary.put(num, dictionary.getOrDefault(num, 0) + 1);
        }

        // Find the number with frequency equal to 1
        for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
