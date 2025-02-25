package ArrayList_InJava;

import java.util.ArrayList;

public class ArraylistsLearning {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("hehe");
        names.add("sagar");
        names.add("Tiwari");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("hehe"));
        System.out.println(names.set(1, "Mr."));
        System.out.println(names.removeIf(n -> n == "hehe"));
        System.out.println(names);
        names.add(0, "java"); // [java, Mr., tiwari]
        names.remove(names.size() - 1); // [java, Mr.]
        System.out.println(names);

    }
}
