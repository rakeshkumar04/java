package ArrayListDSA;

import java.util.ArrayList;

public class ArrayRotationRev {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        int k = 3; 

        rotateArrayList(arrayList, k);

        
        System.out.println(arrayList);
    }

    private static void rotateArrayList(ArrayList<Integer> list, int k) {
        int size = list.size();

        
        reverseList(list, size - k, size - 1);
        System.out.println(list);

        
        reverseList(list, 0, size - k - 1);
        System.out.println(list);

        
        reverseList(list, 0, size - 1);
    }

    private static void reverseList(ArrayList<Integer> list, int start, int end) {
        while (start < end) {
            // Perform swapping without using Collections.swap
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }
}
