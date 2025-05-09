package Arrays;

public class NextPermutation {

    // User function Template for Java

    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int pivot = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                pivot = i - 1;
            }
        }
        // System.out.println(arr[pivot] + " " + pivot);
        if (pivot == -1) {
            // reversing an array;
            int end = n - 1;
            int start = 0;
            while (start < end) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }

            return;
        }
        int nextGreater = n - 1;
        for (int i = nextGreater; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                nextGreater = i;
                break;
            }
        }
        // System.out.println(arr[nextGreater]+ " " + nextGreater);
        int temp = arr[nextGreater];
        arr[nextGreater] = arr[pivot];
        arr[pivot] = temp;

        int end = n - 1;
        pivot++;
        while (pivot < end) {
            temp = arr[end];
            arr[end] = arr[pivot];
            arr[pivot] = temp;
            pivot++;
            end--;
        }
    }

}
