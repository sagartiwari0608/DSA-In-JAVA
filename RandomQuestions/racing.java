
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class racing {

    public static void main(String[] args) {
        String[][] laps = { { "Harold 154", "Gina 155", "Juan 160" }, { "Juan 152", "Gina 153", "Harold 160" },
                { "Harold 148", "Gina 150", "Juan 151" } };
        // String[][] laps = {{"Gina 155", "Eddie 160", "Joy 161", "Harold 163"},
        // {"Harold 151", "Gina 153", "Joy 160", "Eddie 160"},
        // {"Harold 149", "Joy 150", "Gina 152", "Eddie 154"},
        // {"Harold 148", "Gina 150", "Eddie 151", "Joy 155"}};
        int n = laps.length;
        if (n == 0) {
            System.out.println("");
        }
        // int m = laps[0].length;
        List<List<String>> al = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // String[] rec = laps[i];
            int max_number = -1;
            for (int j = 0; j < laps[i].length; j++) {
                String[] arr = laps[i][j].split(" ");
                int grade = Integer.valueOf(arr[1]);
                String name = arr[0];
                if (!hs.contains(name)) {
                    System.out.println("line 37: " + name);
                    if (grade > max_number) {
                        max_number = grade;
                    }
                    hm.put(arr[0], grade);
                }
            }
            // find max , it can be one , two , many : find all max_number string
            List<String> list = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                if (entry.getValue() == max_number) {
                    list.add(entry.getKey());
                    hs.add(entry.getKey());
                }
            }
            if (list.size() == 1) {
                al.add(list);
            } else if (list.size() > 1) {
                Collections.sort(list);
                al.add(list);
            }
            for (String s : list) {
                hm.remove(s);
            }
        }
        for (List<String> al2 : al) {
            for (String str : al2) {
                System.out.println("name: " + str);
            }
        }

    }
}
