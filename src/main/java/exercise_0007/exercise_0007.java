package exercise_0007;

public class exercise_0007 {
    static int reverse(int x) {
        if(x == Integer.MIN_VALUE) return 0;
        int neg = x < 0 ? -1:1;
        x *= neg;
        int ret = 0;
        while(x>0) {
            int n = ret;
            n *= 10;
            n += x % 10;
            x /= 10;
            if(n / 10 != ret) return 0;
            ret = n;
        }

        return ret * neg;
    }
}
