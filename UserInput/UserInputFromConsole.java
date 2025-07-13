package UserInput;

import java.util.Scanner;

public class UserInputFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("input entered is :" + n);
        // similarly we have many methods for scanner class to take input of different types.
        String inputString = sc.nextLine();
        System.out.println("String entered was " + inputString);
    }
}
