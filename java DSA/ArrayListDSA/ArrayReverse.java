package ArrayListDSA;

import java.util.ArrayList;

public class ArrayReverse {

    static void rev(ArrayList<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }

        System.out.println("Before Reverse: "+arr);
        rev(arr,0,arr.size()-1);
        System.out.println("After Reverse: "+arr);

    }
}