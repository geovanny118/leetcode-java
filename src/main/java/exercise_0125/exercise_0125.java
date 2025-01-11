package exercise_0125;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise_0125 {
    public static boolean isPalindrome(String s) {
        s = prepareString(s);
        return s.equals(reverseString(s));
    }

    public static String prepareString(String s) {
        s = removePunctuationAndSpaces(s);
        s = changeToLowerCase(s);
        return s;
    }

    public static String removePunctuationAndSpaces(String s) {
        String pattern = "[.,:;!?@#_'|\\\\/\\- {}\"\\[\\]()`]";
        String substitution = "";
        return s.replaceAll(pattern, substitution);
    }

    public static String changeToLowerCase(String s) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toLowerCase());
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
