package LinkedLists;

import java.util.LinkedList;
import java.util.List;

// here we are going to see inbuilt LinkedList Data structure provided by java
public class InbuiltLL {
    public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.remove(2);
    System.out.println(list.get(0));
    System.out.println(list);
    }


}
