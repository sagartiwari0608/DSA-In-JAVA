package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = (arr.length) / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // this range is end exclusive hence we do this
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return sortAndMerge(left, right);
    }

    public static int[] sortAndMerge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (p1 < left.length && p2 < right.length) {

                if (left[p1] <= right[p2]) {
                    result[i] = left[p1];
                    p1++;
                } else {
                    result[i] = right[p2];
                    p2++;

                }
            } else { // one of the arrays got finished first so we append rest of the other array.
                if (p1 < left.length) {
                    result[i] = left[p1];
                    p1++;
                } else if (p2 < right.length) {
                    result[i] = right[p2];
                    p2++;
                }
            }
        }
        return result;
    }

    public static void mergeSortInPlace(int[] arr, int start, int end) {

        if (start - end == 1) { // because if we have only one element then start minus end will be 1
            return;
        }
        int mid = (arr.length - 1) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        sortAndMergeInPlace(arr, start, mid, end);

    }

    public static void sortAndMergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[arr.length];
        int p1 = start;
        int p2 = end;
        for (int i = 0; i < end; i++) {
            if (arr[p1] <= arr[p2]) {
                mix[p1] = arr[p1];
                p1++;
            } else {
                mix[i] = arr[p2];
                p2++;
            }
        }
        System.arraycopy(mix, 0, arr, 0, arr.length);
        return;
    }

    public static void main(String[] args) {
        int[] unsortedArray = new int[] { 6, 8, 2, 3, 9, 4, 5 };
        // System.out.println(mergeSort(unsortedArray));
        int start = 0;
        int end = unsortedArray.length;
        mergeSortInPlace(unsortedArray, start, end);
        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

}
