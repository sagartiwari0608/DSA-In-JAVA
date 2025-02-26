package comparableVSComparator;

import java.util.ArrayList;

public class CompareImplementations {
    public static void main(String[] args) {
        ComparableExample obj1 = new ComparableExample(18, 89);
        ComparableExample obj2 = new ComparableExample(19, 78);
        ComparableExample obj3 = new ComparableExample(20, 99);
        ComparableExample obj4 = new ComparableExample(17, 95);
        System.out.println(obj1.compareTo(obj4));

        ArrayList<ComparableExample> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.sort((a, b) -> {
            return b.score - a.score;
        });
        System.out.println(list.toString());
    }

}
