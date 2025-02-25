package Hashmaps;
import java.util.HashMap;
import java.util.Set;


public class HashmapLearning {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",140);
        map.put("China",150);    
        map.put("shrilanka",20);    
        map.put("Pakistan",70);    
        map.put("Afghan",60);    
        map.put("bhutan",14);    
        map.put("UK",40);
        System.out.println(map);
        // in hashmap order is not defined
        
        // is we try to put a value for a key which already exists then it will update the value
        map.put("India", 150);
        map.put("nigeria", 50);
        System.out.println(map);
        
        // this is how we can check if value a key is present
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Utopia"));
        
        // since we know one key can only be there for once in a hashmap so this will always return only a set of all the keys.
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String key: keys){
            System.out.println(key + " & value :" + map.get(key));
        }
    }
}
