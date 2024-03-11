package StackDSA;

public class StaticStackOperations {
    static int i=0;


    static void push(int n, int [] arr){
        if(i>=arr.length){
            System.out.println("Stack is Full, can't add values");
        }
        else{
            arr[i] = n;
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

    static void display(int []arr){
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
    }



    public static void main(String[] args) {
        int [] st = new int[3];
        
        push(6,st);
        push(7,st);
        push(8,st);
        push(3,st);

        display(st);

        peek(st);

        pop(st);

        display(st);

        pop(st);
        pop(st);


        System.out.println(i);
        isEmpty(st);
    }
}
