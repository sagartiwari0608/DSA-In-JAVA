package ArraysLeetcode;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        boolean allnine = true;
        for (int i : digits) {
            if (i != 9) {
                allnine = false;
            }
        }
        if (allnine) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
            i--;
        }
        return digits;

        // same code as me but in a shorter way
        // for (int i = digits.length - 1; i >= 0; i--) {
        //     if (digits[i] < 9) {
        //         digits[i]++;
        //         return digits;
        //     }
        //     digits[i] = 0;
        // }

        // digits = new int[digits.length + 1];
        // digits[0] = 1;
        // return digits;

    }
}