package exercise_0042;

public class exercise_0042 {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMaxHeight = height[left];
        int rightMaxHeight = height[right];
        int trappedWater = 0;

        while(left <= right)
        {
            if(height[left] < height[right])
            {
                if (height[left] >= leftMaxHeight)
                {
                    leftMaxHeight = height[left];
                }
                else
                {
                    trappedWater += leftMaxHeight - height[left];
                }
                left++;
            }
            else
            {
                if (height[right] >= rightMaxHeight)
                {
                    rightMaxHeight = height[right];
                }
                else
                {
                    trappedWater += rightMaxHeight - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
}
