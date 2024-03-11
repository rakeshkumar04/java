package StackDSA;



public class StaticStackPalindrome {

    static int i=0;

    static void push(char n, char[] st){
        if(i>=st.length){
            System.out.println("Stack is Full, can't add values");
        }
        else{
            st[i] = n;
            i++;
        }
    }

    static void peek(int []arr){
        System.out.println(arr[i-1]);
    }

    static void pop(int []arr){
        if(i<0){
            System.out.println("Stack is Empty, can't remove values");
        }
        else{
            i--;
        }
    }

    static void isEmpty(int [] arr){
        if(i<=0){
            System.out.println("Is is Empty");
        }
        else{
            System.out.println("It is not Empty");
        }
        
    }

    static void display(char[] st){
        for(int j=i-1;j>=0;j--){
            System.out.print(st[(char)j+65]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        String str = "malayalam";

        char [] st = new char[str.length()];

        for(char c : str.toCharArray()){
            push(c,st);
        }

        display(st);
        
    }
}
