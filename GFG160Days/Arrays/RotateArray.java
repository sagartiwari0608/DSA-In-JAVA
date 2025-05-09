package Arrays;

public class RotateArray {

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        d = d % arr.length; // to reduce number of overall rotations
        // and also to stop the index to go out of bound/ length in line 14.
        int[] arr1 = new int[d];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = arr1[i];
        }

        // Brute force/ naive /slow
        // for(int i = 0; i<d;i++){
        // int temp = 0;
        // temp = arr[0];
        // for(int j = 1; j<arr.length; j++){
        // arr[j-1] = arr[j];
        // }
        // arr[arr.length-1] = temp;
        // }}
    }
}
