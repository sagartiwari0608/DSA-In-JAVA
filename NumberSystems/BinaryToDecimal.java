package NumberSystems;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binarynumber = 110;
        int result = 0;
        int index = 0;
        while (binarynumber > 0) {
            int lastDigit = binarynumber % 10;
            if (lastDigit == 1) {
                result = result + (int) Math.pow(2, index);
            }
            index++;
            binarynumber = binarynumber / 10;
        }
        System.out.println(result);
    }
}
