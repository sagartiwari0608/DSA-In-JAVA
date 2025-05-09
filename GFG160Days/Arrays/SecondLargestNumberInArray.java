package Arrays;

public class SecondLargestNumberInArray {

    // this code is for optimised solution in linear time and constant space.we
    // should also know how to implement normally.
    public static int getSecondLargest(int[] arr) {
        // code here
        int maxElement = Integer.MIN_VALUE;
        if (arr.length < 2) {
            return -1;
        }
        int secondMax = maxElement;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < maxElement) {
                secondMax = arr[i];
            }

            if (arr[i] > maxElement) {
                secondMax = maxElement;
                maxElement = arr[i];
            }

            else if ((i == arr.length - 1) && (secondMax == Integer.MIN_VALUE)) {
                return -1;
            }
        }
        return secondMax;
    }

    static void rotateArr(int arr[], int d) {
        // add your code here
        // System.out.println(d);
        int[] arr1 = new int[d];
        for (int i = 0; i < arr1.length; i++) {
            // System.out.println(i +" "+ arr1.length);
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = arr1[i];
        }

        // for(int i = 0; i<d;i++){

        // int temp = 0;
        // temp = arr[0];
        // for(int j = 1; j<arr.length; j++){
        // arr[j-1] = arr[j];
        // }
        // arr[arr.length-1] = temp;
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 23, 35, 35 };
        System.out.println(getSecondLargest(arr));
    }
}
