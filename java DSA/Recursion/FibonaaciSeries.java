package Recursion;

public class FibonaaciSeries {
    static int a=0;
    static int b=1;
    static int sum=0;

    static int fib(int n){
        if(n==1){
            return 1;
        }
        else{
            sum=a+b;
            a=b;
            b=sum;
            fib(n-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
