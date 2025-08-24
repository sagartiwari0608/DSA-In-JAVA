package ArraysLeetcode;

public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        // this was brute force or naive approach here we are using hasmap. 
        //  but this can be optimised to not use any additional space at all. with Moore's Voting algorithm. 
        // int n = nums.length/2;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i : nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int i : map.keySet()){
        //     if(map.get(i)>n){
        //         return i;
        //     }
        // }
        // return -1;

        // Optimised approach: Moore's Voting algorithm O(n) time and O(1) space.
        int count = 0, candidate = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0)
                candidate = nums[i];
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
        // so this algo works because basic idea is we increase if we are searching for majority element we are gonna encounter more of them and eventually they will be together too in the array and hence we will be able to reach to actuall candidate in the end.
    }
}
