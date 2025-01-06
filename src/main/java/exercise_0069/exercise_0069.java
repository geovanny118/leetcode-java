package exercise_0069;

public class exercise_0069 {
    public static int mySqrt(int x) {
        if (x == 1)
            return 1;

        return binarySearch(x);
    }

    public static int binarySearch(int targetValue) {
        //Prepare  Binary Search
        //x = 16
        //[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

        int low = 0;
        int high = targetValue;
        int bestChoice = 0;

        //Perform Binary Search
        while (low < high)
        {
            int middleValue = (low + high) / 2;
            if (bestChoice == middleValue)
                return bestChoice;

            if (HelperChecker(middleValue, targetValue))
            {
                bestChoice = middleValue;
                low = middleValue + 1;
            }
            else high = middleValue;
        }
        return bestChoice;
    }

    public static boolean HelperChecker(int value, int target) {
        return (value * value) <= target && value <= 46340;
    }
}
