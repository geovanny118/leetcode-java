package exercise_0009;

public class exercise_0009 {
    public static void main(String[] args) {
        System.out.println("Exercise 9");
        int number = 545;
        boolean result = IsPalindrome(number);
        System.out.println(result);
    }

    static boolean IsPalindrome(int number)
    {
        if (number < 0) return false;
        else return number == reverse(number);
    }

    static int reverse(int number)
    {
        if (number == Integer.MIN_VALUE) return 0;
        int neg = number < 0 ? -1 : 1;
        number *= neg;
        int ret = 0;
        while (number > 0)
        {
            int n = ret;
            n *= 10;
            n += number % 10;
            number /= 10;
            if (n / 10 != ret) return 0;
            ret = n;
        }

        return ret * neg;
    }
}
