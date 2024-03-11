package StackDSA;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValidPar(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char i : str.toCharArray()) {
            if (i == '(') {
                stack.push(i);
            } else if (i == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("((()())) : "+isValidPar("((()()))")); 
        System.out.println(")(()()) : "+isValidPar(")(()())"));   
        System.out.println(")( : "+isValidPar(")("));         
        System.out.println("( : "+isValidPar("("));         
        System.out.println(")))((( : "+isValidPar(")))((("));     
    }
}
