package ArraysInJava;

public class ArrayImplementation {
    public static void main(String[] args) {

        MyArrays newArray = new MyArrays(7);
        newArray.insert(4);
        newArray.insert(5);
        newArray.insert(6);
        System.out.println(newArray);
        // System.out.println(newArray.find(5));
        // System.out.println("removed item " + newArray.removeAtIndex(0));
        // System.out.println(newArray.find(5));
        // System.out.println(newArray);
        // System.out.println("removed item " + newArray.removeAtIndex(10));
        // System.out.println(newArray.max());
        // System.out.println(newArray.min());
        newArray.reverseArray();
        System.out.println(newArray);
    }

}