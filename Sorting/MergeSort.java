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
        int p1 = 0; // left array pointer
        int p2 = 0; // right array pointer
        int index =0;
        while(p1<left.length && p2<right.length){
            if(left[p1]<=right[p2]){
                result[index] = left[p1];
                p1++;
            }
            else{
                result[index] = right[p2];
                p2++;
            }
                index++;
        }
        while(p1< left.length){
            result[index] = left[p1];
            p1++;
            index++;
        }
        while(p2<right.length){
            result[index] = right[p2];
            p2++;
            index++;
        }
        return result;

//        for (int i = 0; i < result.length; i++) {
//            if (p1 < left.length && p2 < right.length) {
//
//                if (left[p1] <= right[p2]) {
//                    result[i] = left[p1];
//                    p1++;
//                } else {
//                    result[i] = right[p2];
//                    p2++;
//
//                }
//            } else { // one of the arrays got finished first so we append rest of the other array.
//                if (p1 < left.length) {
//                    result[i] = left[p1];
//                    p1++;
//                } else if (p2 < right.length) {
//                    result[i] = right[p2];
//                    p2++;
//                }
//            }
//        }
//        return result;
    }

    public static void mergeSortInPlace(int[] arr, int start, int end) {

        if (end -start == 1 ) { // because if we have only one element then start minus end will be 1
            return;
        }
        int mid = (start+end) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        sortAndMergeInPlace(arr, start, mid, end);

    }

    public static void sortAndMergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end-start];
        int p1 = start;
        int p2 = mid;
        int index =0;
        while(p1<mid && p2<end){
            if(arr[p1]<=arr[p2]){
                mix[index] = arr[p1];
                p1++;
            }
            else{
                mix[index] = arr[p2];
                p2++;
            }
            index++;
        }
        while(p1< mid){
            mix[index] = arr[p1];
            p1++;
            index++;
        }
        while(p2<end){
            mix[index] = arr[p2];
            p2++;
            index++;
        }
        for (int i = 0; i < mix.length; i++) {
            arr[start+i] = mix[i];
        }

//this following for loop has some issues so we are having to change some stuff here.
//        for (int i = 0; i < mix.length; i++) {
//            if(p1<mid && p2<end){
//
//                if (arr[p1] <= arr[p2]) {
//                    mix[i] = arr[p1];
//                    p1++;
//                } else {
//                    mix[i] = arr[p2];
//                    p2++;
//                }
//            }else{
//                if (p1 < mid) {
//                    mix[i] = arr[p1];
//                    p1++;
//                } else if (p2 < end) {
//                    mix[i] = arr[p2];
//                    p2++;
//                }
//            }
//        }
    }


    public static void main(String[] args) {
        int[] unsortedArray = new int[] { 6, 8, 2, 3, 9, 4, 5 };
//        int[] sortedArray = mergeSort(unsortedArray);
//        for (int i : sortedArray) {
//            System.out.println(i);
//        }
        int start = 0;
        int end = unsortedArray.length;
        mergeSortInPlace(unsortedArray, start, end);

        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

}
