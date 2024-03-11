package StackDSA;

import java.util.Stack;

public class EvaluateNotation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<Integer>();

        int temp1,temp2;

        for(String c : tokens){
            if(c.equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(c.equals("*")){
                st.push(st.pop()*st.pop());
            }
            else if(c.equals("-")){
                temp1=st.pop();
                temp2=st.pop();
                st.push(temp2-temp1);
            }
            else if(c.equals("/")){
                temp1=st.pop();
                temp2=st.pop();
                st.push(temp2/temp1);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {

        String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        
        System.out.println(evalRPN(tokens));
    }
}
