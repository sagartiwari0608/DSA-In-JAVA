package ArraysLeetcode;

public class RemoveDuplicatesInPlace26 {
    public int removeDuplicates(int[] nums) {
        // idea to have a slow pointer and a fast pointer fast one here is i and i will iterate i and 
        // if the slow pointer is not equal to the fast pointer then we will increment the slow pointer and assign the value of fast pointer to the slow pointer.
        int n = nums.length;
        if (n == 1)
            return 1;
        int k = 1;
        int slow = 0;
        for (int i = 1; i < n; i++) {
            if (nums[slow] != nums[i]) {
                nums[++slow] = nums[i];
                k++; // increment k as we have found a new unique element.
            }
        }
        return k;
    }
}
