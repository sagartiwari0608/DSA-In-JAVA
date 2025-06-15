package LeetCodeQuestionsSolved;

// class NumArray {

//     private int[] nums;

//     public NumArray(int[] nums) {
//         this.nums = nums;
//     }

//     public int sumRange(int left, int right) {
//         int result=0;
//         for(int i= left; i<=right;i++){
//              result += this.nums[i];
//         }
//         return result;
//     }
// }
// the above code is slow in case of repeated calls. as it calculates all the sums repeatedly.
// now we see the optimal solution which will be using prefix sum approach because here we calculate the sum in advance and then utilise the fomula.

public class RangeSumQuery {

    private int[] prefixSum;

    public RangeSumQuery(int[] nums) {
        this.prefixSum = nums;
        this.prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
