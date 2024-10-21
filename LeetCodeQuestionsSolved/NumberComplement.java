package LeetCodeQuestionsSolved;

public class NumberComplement {
    public static int findComplement(int num) {
        // String result = "";
        // while (num > 0) {
        // int remainder = (num % 2 == 0) ? 1 : 0;
        // num = num / 2;
        // result = remainder + result;
        // }
        // System.out.println("string result after converting" + result);
        // int binaryResult = Integer.parseInt(result);
        // int value = 0;
        // int index = 0;
        // while (binaryResult > 0) {
        // int lastDigit = binaryResult % 10;
        // if (lastDigit == 1) {
        // value = value + (int) Math.pow(2, index);
        // System.out.println("value in loop" + value);
        // }
        // binaryResult = binaryResult / 10;
        // index++;
        // }
        // return value;
        // the above code will work but only if our number is small otherwise the bits
        // will start overflowing the integer limit
        // hence we need another solution and concept known as masking
        int copyNum = num;
        int mask = 0;
        if (num == 0) {
            return 1;
        }
        while (copyNum > 0) {
            mask = mask << 1 | 1;
            copyNum = copyNum >> 1;
        }
        return ~num & mask;
    }

    public static void main(String[] args) {
        System.out.println("final value " + findComplement(5));
    }
}
