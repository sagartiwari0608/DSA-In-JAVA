package LeetCodeQuestionsSolved;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        for (int j : nums1) {
            if (set.contains(j)) {
                resultSet.add(j);
            }
        }
        int[] resultArr = new int[resultSet.size()];
        int index = 0;
        for (Integer x : resultSet) {
            resultArr[index++] = x;
        }
        return resultArr;

        // the following is the way used by piyush in his videos. and it works but i was
        // stupid so it didn't work for me . anyways there is a better solution with
        // lesser time complexity.
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // while (i < nums1.length && j < nums2.length) {
        // System.out.println(nums1[i] + " " + nums2[j]);
        // if (nums1[i] == nums2[j]) {
        // set.add(nums1[i]);
        // i++;
        // j++;
        // } else if (nums1[i] < nums2[j]) {
        // i++;
        // } else {
        // j++;
        // }
        // }
        // int[] nums3 = new int[set.size()];
        // int index = 0;
        // for (var x : set) {
        // nums3[index] = Integer.parseInt(x.toString());
        // index++;
        // }
        // return nums3;
    }
}
