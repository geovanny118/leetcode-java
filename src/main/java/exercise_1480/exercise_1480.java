package exercise_1480;

public class exercise_1480 {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] answer = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            sum+= nums[i];
            answer[i] = sum;
        }

        return answer;
    }
}
