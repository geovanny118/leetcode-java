package exercise_0013;

import java.util.Map;
import java.util.HashMap;

public class exercise_0013 {

    public static void main(String[] args) {
        System.out.println("Exercise 13");
        String s = "XIII";
        int result = RomanToInt(s);
        System.out.println("Roman number: " + s);
        System.out.println("Integer number: " + result);
    }

    static int RomanToInt(String s)
    {
        Map<Character, Integer> romanDictionary = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        //set position in last Roman Number
        int i = (s.length() - 1);
        int number = romanDictionary.get(s.charAt(i));
        i--;

        //Walk through the array and add the integers
        while (i > -1)
        {
            if ((romanDictionary.get(s.charAt(i))) < (romanDictionary.get(s.charAt(i+1))))
            {
                number -= romanDictionary.get(s.charAt(i));
            }
            else
            {
                number += romanDictionary.get(s.charAt(i));
            }
            i--;
        }
        return number;
    }
}
