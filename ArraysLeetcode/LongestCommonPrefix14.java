package ArraysLeetcode;

// import java.util.Arrays;

public class LongestCommonPrefix14 {

    public String longestCommonPrefix(String[] strs) {
        // here the idea is to take the first string and prefix and continue to reduce it from the end if the next string doesn't contain the first string.

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    // following method works fine but is slow because we are sorting first and then comparing. 
    //     public String longestCommonPrefix(String[] strs) {
    //     String result = "";
    //     int n = strs.length;
    //     Arrays.sort(strs); // important step as we want all of the words to match not just a longest and shortest.
    //     //  so once sorted we will be able to make sure that all elements are sorted based on characters from starting to end and hence we can make sure in flower, flow, flight, rat, the sorted order takes flight, flow, flower, rat. and hence now we need not compare everything since everything is sorted so if the last one also had something in common that means they were sorted based on other characters and hence we have some thing in common as prefix.

    //     String smallest = strs[0];
    //     String biggest = strs[n-1];
    //     System.out.println("smallest " + smallest + " biggest "+ biggest);
    //     int i =0;
    //     while(i<smallest.length() && i <biggest.length()){
    //         if(smallest.charAt(i) == biggest.charAt(i)){
    //             i++;
    //         }else{
    //             break;

    //         }
    //     }

    //     return biggest.substring(0,i);
    // }
    // following one is fine but doesn't actually handle the real edge case ["abab","aba","abc"] 
    // it takes smallest one as aba and returns result of comparison with abab
    //  so solution has to be with sorting as we need to sort first and see if the characters match.
    // for(int i =0; i< strs.length;i++){
    //     if(strs[i].length() < minlength){
    //         minidx = i;
    //         minlength =strs[i].length();
    //      }
    //      if(strs[i].length() >= maxLength){
    //         maxidx = i;
    //         maxLength =strs[i].length();
    //     }
    // }
}