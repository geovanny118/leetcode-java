package exercise_0058;

public class exercise_0058 {
    public static int lengthOfLastWord(String s) {
        String word = s.replaceAll("\\s+$", "");

        if(!word.contains(" ")){
            return word.length();
        }

        int index = word.length()-1;
        int result = 0;

        if(index == 0){
            return 1;
        }

        while(word.charAt(index) != ' '){
            result++;
            index--;
        }

        return result;
    }
}
