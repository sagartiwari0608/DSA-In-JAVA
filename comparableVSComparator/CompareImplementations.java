package comparableVSComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class CompareImplementations {
    public static void main(String[] args) {
        Student obj1 = new Student(18, 89);
        Student obj2 = new Student(19, 78);
        Student obj3 = new Student(20, 99);
        Student obj4 = new Student(17, 95);
        System.out.println(obj1.compareTo(obj4));

        ArrayList<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        // Comparator<> obj5 = new Comparator<>() {
        //     public int compare(T o1, T o2) {
        //         return o1.age - o2.age; 
        //     };
        // };
        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.score - o2.score; // Sorting based on score
            }
        };
        list.sort(comparator);
        // list?
        System.out.println(list.toString());
    }

}
