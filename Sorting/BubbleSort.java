package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 6, 3, 9, 2, 1 };
        // here we start from start and compare with right side and see if its smaller
        // if yes then swap and continue this way when fist nested iteration complets we
        // will have biggest item in the end and then repeat the process for remaining
        // but
        // last (already sorted).
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}