package exercise_0067;

public class exercise_0067 {
    public static String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int index_a = a.length()-1;
        int index_b = b.length()-1;
        int carry = 0;

        while(index_a >= 0 || index_b >= 0){
            int sum = carry;
            if(index_a >= 0)
                sum += a.charAt(index_a) - '0';
            if(index_b >= 0)
                sum += b.charAt(index_b) - '0';
            answer.append(sum%2);
            carry = sum/2;
            index_a--;
            index_b--;
        }

        if(carry != 0) answer.append(carry);
        return answer.reverse().toString();
    }
}
