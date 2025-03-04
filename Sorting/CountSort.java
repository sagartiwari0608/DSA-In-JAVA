package Sorting;

public class CountSort {

    public static int[] countSort(int[] arr, int max, int min) {
        int[] freqArr = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i] - min]++;
        }
        // now we have a frequency array
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] = freqArr[i] + freqArr[i - 1];
        }
        // now this frequency array is telling us where we need to store each index in a
        // new array.
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int index = freqArr[val - min];
            ans[index - 1] = arr[i];
            freqArr[val - min]--;
        }
        int index = 0;
        for (int i : ans) {
            arr[index] = i;
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] unsorted = { 9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9 };
        int[] sorted = countSort(unsorted, 9, 3);
        for (int i : sorted) {
            System.out.println(i);
        }
    }
}
