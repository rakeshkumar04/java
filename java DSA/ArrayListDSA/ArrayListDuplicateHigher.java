package ArrayListDSA;

import java.util.ArrayList;

public class ArrayListDuplicateHigher {

    static boolean check(int temp[], int k) {
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(895);
        arr.add(666);
        arr.add(222);
        arr.add(794);
        arr.add(895);
        arr.add(222);
        arr.add(666);

        int size = arr.size();

        System.out.println("Array: " + arr);
        System.out.println(" ");

        int[] temp = new int[size];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (!check(temp, arr.get(i))) {
                temp[j++] = arr.get(i);
            }
        }

        arr.clear();
        for (int i : temp) {
            if (i != 0) {
                arr.add(i);
            }
        }

        System.out.println("After Removing Duplicates " + arr);
    }
}
