package Sorting;

public class QuickSelect {
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

    public static int quickSelectIndex(int[] arr, int start, int end, int k) {
        int pivot = arr.length - 1;
        int pIndex = partitionOnPivot(arr, 0, arr.length, pivot);
        if (k > pIndex) {
            return quickSelectIndex(arr, pIndex + 1, end, k);
        } else if (k < pIndex) {
            return quickSelectIndex(arr, start, pIndex - 1, k);
        } else {
            return pivot;
        }

    }
}
