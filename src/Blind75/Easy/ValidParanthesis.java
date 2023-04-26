package Blind75.Easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args){
        String s = "()[]{}";
        String s1 = ")(";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
    }

    public static boolean isValid(String s){
        if(s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }


}
