package exercise_0066;

public class exercise_0066 {
    public static int[] plusOne(int[] digits) {
        int number = digits.length;
        for(int i=number-1; i>=0; i--){
            if(digits[i] < 9 ){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_number = new int[number+1];
        new_number[0] = 1;
        return new_number;
    }
}
