package exercise_0070;

public class exercise_0070 {
    public static int climbStairs(int n) {
        n=n+1;
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;

        int fibPrevPrev = 0;
        int fibPrev = 1;
        int fibCurrent = 1;

        for (int i = 2; i <= n; i++)
        {
            fibCurrent = fibPrev + fibPrevPrev;
            fibPrevPrev = fibPrev;
            fibPrev = fibCurrent;
        }

        return fibCurrent;
    }
}
