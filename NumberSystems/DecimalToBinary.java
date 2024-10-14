package NumberSystems;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String result = "";

        // Now java way and way faster
        while (input > 0) {
            int temp = input & 1;
            result = temp + result;
            // input = input >> 1;
            input >>= 1;

        }

        // Noob way but works in every language

        // while (input > 0) {
        // int remainder = input % 2;
        // input = input / 2;
        // result = remainder + result;
        // }
        System.out.println(result);
        sc.close();
    }
}
