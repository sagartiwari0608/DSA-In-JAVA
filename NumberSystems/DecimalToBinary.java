package NumberSystems;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String result = "";
        while (input > 0) {
            int remainder = input % 2;
            input = input / 2;
            result = remainder + result;
        }
        System.out.println(result);
    }
}
