package Hashmaps.questions;

import java.util.HashMap;

public class HighestFrequencyCharacter {
    // abracadabra count the the character which repeats most times and return it.
    public static void main(String[] args) {
        String str = "abracadabra";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int oldValue = map.get(ch);
                map.put(ch, ++oldValue);
            }
            else{
                map.put(ch, 1);
            }
        }

        int max = 0;
        for(char key: map.keySet()){
            if(map.get(key)>max){
                max= map.get(key);
            }
            
        }
        System.out.println(max);
    }

}
