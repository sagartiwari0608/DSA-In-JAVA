package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 7, 5, 6, 3, 9, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i; // this is how this algo differs from other here we are reducing the number of
                              // swaps. by selecting a minimum item and swapping only that.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= arr[minIndex]) {
                    minIndex = j;
                }
                if (minIndex != i) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}