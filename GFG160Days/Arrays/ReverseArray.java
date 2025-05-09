package Arrays;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        // code here
        if (arr.length <= 1)
            return;
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }
}