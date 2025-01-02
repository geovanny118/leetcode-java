package exercise_0026;

public class exercise_0026 {
    static int removeDuplicates(int[] nums) {
        int previous = 0;
        if(nums.length == 0){
            return previous;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[previous]){
                previous++;
                nums[previous] = nums[i];
            }
        }
        return (previous+1);
    }
}
