package exercise_0003;

public class exercise_0003 {
    public static void main( String[] args )
    {
        System.out.println( "LeetCode Exercise 0003" );
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        //print result
        System.out.println(result);
    }

    static int lengthOfLongestSubstring(String s) {
        char[] characterArray = s.toCharArray();
        StringBuilder output = new StringBuilder();
        int maxCounter = 0;
        int index;

        for (char c : characterArray) {
            CharSequence charSequence = String.valueOf(c);

            if (output.toString().contains(charSequence)) {
                index = output.toString().indexOf(c);
                output.delete(0, index + 1);
            }

            output.append(c);
            maxCounter = Math.max(maxCounter, output.length());
        }

        if(maxCounter == 0) {
            maxCounter = output.length();
        }

        if(s.isEmpty()){
            return 0;
        }else if(s.equals(" ")){
            return 1;
        }

        return maxCounter;
    }
}
