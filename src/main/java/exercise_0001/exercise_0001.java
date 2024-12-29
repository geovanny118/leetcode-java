package exercise_0001;

public class exercise_0001 {
    public static void main( String[] args )
    {
        System.out.println( "LeetCode Exercise 0001" );
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = TwoSum(nums, target);
        StringBuilder answer = new StringBuilder();
        answer.append(result[0]).append(" ").append(result[1]);
        //print result
        System.out.println(answer.toString());
    }

    static int[] TwoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        for (int index_1 = 0; index_1 < nums.length; index_1++)
        {
            for (int index_2 = index_1 + 1; index_2 < nums.length; index_2++)
            {
                if (nums[index_1] + nums[index_2] == target)
                {
                    result[0] = index_1;
                    result[1] = index_2;
                    return result;
                }
            }
        }
        return result;
    }
}
