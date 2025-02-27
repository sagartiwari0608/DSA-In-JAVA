package LeetCodeQuestionsSolved;

import java.util.List;

public class Triangle120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        // int total = triangle.get(0).get(0);/
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                int sum = min + triangle.get(i).get(j);
                triangle.get(i).set(j, sum);
            }

        }
        return triangle.get(0).get(0);
        // int index=0;
        // for(int i =0; i<triangle.size()-1;i++){
        // if(triangle.size() > 1){
        // int resultWithi=dfs(triangle,index);
        // int resultwithiPlusOne=dfs(triangle,index+1);
        // return Math.max(resultWithi, resultwithiPlusOne);
        // }
        // // }

        // return total;
    }

}