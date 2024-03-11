package StackDSA;
import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {

        String str = "malayala";
        Stack <Character> st = new Stack <Character>();

        for(char c : str.toCharArray()){
            st.push(c);
        }
        
        String rev = new String();
        
        
        for(int i=0; i<str.length(); i++){
            char temp = st.peek();
            st.pop();
            rev = rev + temp; 
        }

        if(rev.equals(str)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
        
    }
}
