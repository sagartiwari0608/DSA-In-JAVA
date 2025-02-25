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

        // inbuilt arrays
        int[] arr = new int[5];
        arr[3] = 2;
        arr[1] = 6;
        arr[0] = 5;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + arr.length);
        int[] clonedCopy = arr.clone(); // this clone creates a shallow copy. but when its just one dimentional array
                                        // then its a deep copy.
        // but if we had
        for (int i : clonedCopy) {
            System.out.print(i + " ");
        }
        int[][] twoDArray = { { 1, 2, 3 }, { 6, 4, 5 } };
        int[][] copy2dArray = twoDArray.clone(); // here it will only copy the first level array. which is again
                                                 // reference to the same array hence here we will not get an actual
                                                 // copy.
        // which means if we make changes to one it makes changes to other. not good
        copy2dArray[1][0] = 7;
        System.out.println("\n" + twoDArray[1][0]); // see here its changed 7 which shouldn't have happened
    }

}