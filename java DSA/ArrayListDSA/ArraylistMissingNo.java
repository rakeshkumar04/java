package ArrayListDSA;

import java.util.*;

public class ArraylistMissingNo {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(45);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(10);
        arr.add(18);
        arr.add(25);
        arr.add(13);
        arr.add(10);

        arr.sort(null);

        int min=arr.get(0);

        for(int i : arr){
            if(i<min){
                min=i;
            }
        }

        int j=min;

        System.out.println("Missing No: ");

        for(int i=0;i<arr.size();i++){
           while(arr.get(i)!=j){
             System.out.print(j+" ");
             j++;
           }
           j++;
        }     
    }
}
