package ArraysInJava;

import java.util.Arrays;
// this shit worked but i wont use it as it is more complex and unable to solve problems arising in this 
public class MergingSortIssueTrial {
    public static void main(String[] args) {
        int[] original = new int[] { 2, 4, 5, 1, 8, 9 };
        int mid = original.length / 2;
        int[] left = Arrays.copyOfRange(original, 0, mid);
        int[] right = Arrays.copyOfRange(original, mid, original.length);
        System.out.println("left");
        for (int i : left) {
            System.out.println(i);
        }
        System.out.println("right");

        for (int i : right) {
            System.out.println(i);
        }
        int[] result = new int[left.length + right.length];
        System.out.println("loop start");
        // System.out.println(result.length);
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < original.length; i++) {
            if (p1 < left.length && p2 < right.length) {

                if (left[p1] <= right[p2]) {
                    System.out.println(left[p1] + " p1 " + p1);
                    System.out.println(right[p2] + " p2 " + p2);
                    result[i] = left[p1];
                    p1++;
                } else {

                    System.out.println(left[p1] + " else p1 " + p1);
                    System.out.println(right[p2] + " else p2 " + p2);
                    result[i] = right[p2];
                    p2++;

                }
            } else {
                if (p1 < left.length) {
                    result[i] = left[p1];
                    p1++;
                } else if (p2 < right.length) {
                    result[i] = right[p2];
                    p2++;
                }
            }
        }
        for (int i : result) {
            System.out.println(i);
        }

    }

}
