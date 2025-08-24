package ArraysLeetcode;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        // the solution is very human, and thanks to whoevers solution i read. and O(n) time complexity. and O(1) space.
        // idea behind is that if there is a range 0->4 sum of all elements should be equals to 10. now if any number is missing
        // we can subtract sum of existing numbers from expectedSum of 10 to get the missing number. exampple 0,1,2,4 sum is 7 and missing item is 3;
        // so 7 +3 would have been 10. and 10 - 7 = 3. hence we got our answer.
        int expectedSum = 0, actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            expectedSum += i;
            actualSum += nums[i];
        }
        expectedSum += nums.length;
        return expectedSum - actualSum;
    }
}
