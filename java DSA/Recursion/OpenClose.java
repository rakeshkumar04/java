package Recursion;

public class OpenClose {

    static int start = 1;
    static int end=0;
    
    static void open(int start, int a){ 
        end = a;
        if(start<=end){
            System.out.println("Open "+start);
            open(start+1,end);
        }
        else{
            System.out.println("End");
        }
    }

    static void close(int start, int end){ 
        if(start<=end){
            System.out.println("Close "+end);
            close(start,end-1);
        }
        else{
            System.out.println("End");
        }
    }

    public static void main(String[] args) {
        open(start,5);
        close(start, end);
    }
}
