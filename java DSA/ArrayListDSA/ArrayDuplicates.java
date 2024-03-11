package ArrayListDSA;

import java.util.ArrayList;

public class ArrayDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(4);

        int size = arr.size();

        System.out.println("Array: "+arr);
        boolean []count = new boolean[size];

        for(int i=0;i<size;i++){
            count[arr.get(i)]=true;
        }
        arr.clear();
        System.out.println("Array after Removing Duplicate Elements: ");
        for(int i=0;i<size;i++){
            if(count[i]==true){
                arr.add(i);
            }
        }

        System.out.println(arr);
    }
}
