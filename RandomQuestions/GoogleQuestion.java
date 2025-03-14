public class GoogleQuestion {
    public static int[] computeArrayProduct(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }

    public static int[] computeArrayProductLinearly(int[] nums) {
        int[] result = new int[nums.length];

        int temp = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            } else {
                temp *= nums[i];
            }
        }
        if (count > 1) {
            return result;
        }
        // for (int i = 0; i < result.length; i++) {
        // result[i] = temp;
        // }
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0) {
                result[i] = temp;
            } else {
                result[i] = 0;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3 };
        // int[] nums = { 6, 5, 4 };
        int[] nums = { 6, 5, 0 };
        // int[] result = computeArrayProduct(nums);
        int[] result = computeArrayProductLinearly(nums);
        for (int i : result) {
            System.out.println(i);
        }

    }

}
