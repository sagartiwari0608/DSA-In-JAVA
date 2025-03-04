package Sorting;

public class QuickSort {

    public static void QuickSortInPlace(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = arr[end];
        int newPivot = partitionOnPivot(arr, start, end, pivot);
        QuickSortInPlace(arr, start, newPivot - 1);
        QuickSortInPlace(arr, newPivot + 1, end);

    }

    public static int partitionOnPivot(int[] arr, int start, int end, int pivot) {
        int i = start;
        int j = start;
        while (i < end) {
            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
                i++;
            }
        }
        return j - 1; // index where the partition has happpend

    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 8, 7, 5, 18, 6, 3 }; // this algo can also be very ineffective if we dont select the pivot
                                                  // carefully. the best way is to select the pivot last element
        // int[] arr = { 7, 9, 4, 8, 3, 6, 2, 1 };
        partitionOnPivot(arr, 0, arr.length, 3); // here if we select last element then it will always work fine.
        // QuickSortInPlace(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
