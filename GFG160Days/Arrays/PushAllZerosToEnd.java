package Arrays;

public class PushAllZerosToEnd {

    // This is without maintaining order in linear(n) time, two pointer method
    // used.
    // void pushZerosToEnd(int[] arr) {
    // // code here
    // int start = 0;
    // int end = arr.length-1;
    // while(start<end){
    // if(arr[end] == 0){
    // end--;
    // }
    // else if(arr[start]!=0){
    // start++;
    // }
    // else if(arr[start]==0 && arr[end]!= 0){
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // }
    // }
    // }

    // this is to maintain order and implement linearly. two pointer method used.
    void pushZerosToEnd(int[] arr) {
        // code here
        int slow = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[slow] = arr[i];
                slow++;
            }
        }
        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
    }

}
