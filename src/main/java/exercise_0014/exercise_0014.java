package exercise_0014;

public class exercise_0014 {
    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int slen = strs[0].length();

        for(String word : strs) {
            slen = Math.min(slen, word.length());

            for(int i = 0; i < slen; i++) {
                if (ans.charAt(i) != word.charAt(i)) {
                    slen = i;
                    break;
                }
            }

            if (slen == 0) {
                return "";
            }
        }

        return ans.substring(0,slen);
    }
}
