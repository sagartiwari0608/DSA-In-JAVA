package comparableVSComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareImplementations {
    public static void main(String[] args) {
        Student obj1 = new Student(18, 89);
        Student obj2 = new Student(19, 78);
        Student obj3 = new Student(20, 99);
        Student obj4 = new Student(17, 95);

        ArrayList<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        System.out.println(obj1.compareTo(obj4));

        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.score - o2.score; // Sorting based on score
            }
        };
        Collections.sort(list); // This sort method will take the  implementation of Comparable method compareto present in Student class which we implemented.  
        list.sort(comparator);

        // Sorting based on external/Custom logic using comparator here our class didn not need to implement Comparator in the class.
        list.sort((o1, o2) -> {
            return o1.score - o2.score;
        });
        System.out.println(list.toString());
    }

}
