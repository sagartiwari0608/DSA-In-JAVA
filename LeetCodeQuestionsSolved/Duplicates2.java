package LeetCodeQuestionsSolved;

import java.util.HashSet;

public class Duplicates2 {

    // following method is a sliding window technique. i was actually thinking about
    // this
    // this but couldn't figure out the logic in my brain.
    // now its clear.

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    // following was my first submission it worked perfectly fine but was slower.
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    // for(int i =0; i< nums.length;i++){
    // for(int j = i+1; j<nums.length;j++){
    // if(i==j){
    // continue;
    // }
    // if(nums[i]==nums[j] && (j-i) <=k){
    // return true;
    // }
    // }
    // }
    // return false;

    // }

}