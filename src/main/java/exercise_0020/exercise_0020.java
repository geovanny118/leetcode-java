package exercise_0020;

import java.util.HashMap;
import java.util.Stack;

/*
 *  26. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([])"
 * Output: true
 */
public class exercise_0020 {
    static public boolean isValid(String s) {
        //define HashMap
        HashMap<Character, Character> parenthesesDictionary = new HashMap<Character, Character>(){{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        //define stack
        Stack<Character> parenthesesStack = new Stack<>();

        //solution
        for(int index=0; index < s.length(); index++){
            char simbol = s.charAt(index);

            if(!parenthesesDictionary.containsKey(simbol) && parenthesesStack.isEmpty()){
                return false;
            }

            if(parenthesesDictionary.containsKey(simbol)){
                parenthesesStack.push(parenthesesDictionary.get(simbol));
                continue;
            }

            char popped = (char) parenthesesStack.pop();

            if(popped != simbol){
                return false;
            }
        }

        return parenthesesStack.isEmpty();
    }
}
