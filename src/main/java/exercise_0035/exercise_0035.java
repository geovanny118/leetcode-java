package exercise_0035;

public class exercise_0035 {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        while(index < nums.length){
            if(nums[index]==target){
                break;
            }
            if(nums[index]>target){
                break;
            }
            index++;
        }
        return index;
    }
}
