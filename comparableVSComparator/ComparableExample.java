package comparableVSComparator;

import java.util.Comparator;

public class ComparableExample implements Comparable<ComparableExample>, Comparator<ComparableExample> {
    int age;
    int score;

    ComparableExample(int age, int score) {
        this.age = age;
        this.score = score;
    }

    // this compareTo method is in Comparable interface and it is something we have
    // to implement and it compares "this" obj with another Obj
    @Override
    public int compareTo(ComparableExample o) {
        return this.age - o.age; // logic is if this - Object = +ve then "this" must be bigger
        // if this - Obj = 0 then they are equal
        // if this - Obj = -ve then this must be smaller than Obj;
    }

    @Override
    public int compare(ComparableExample o1, ComparableExample o2) {
        return o1.score - o2.score;
    }

    @Override
    public String toString() {
        return this.age + ": age  & score: " + this.score;
    }
}
