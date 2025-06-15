package StringAndData;

public class StringLearning {
    public static void main(String[] args) {

        // IN Java strings are one of the most used non primitive data structure.and
        // most important thing used while learning any programming language the print
        // statement,

        String str = "Hello World!";
        System.out.println("Original String: " + str);

        // in java which is System.out.println() works only with strings. so internally
        // it tries to convert any data type that we throw at it into a string and then
        // prints it.

        // String length
        System.out.println("Length of the string: " + str.length());

        // Substring
        String subStr = str.substring(0, 5);
        System.out.println("Substring (0, 5): " + subStr);

        // Character at index
        char ch = str.charAt(6);
        System.out.println("Character at index 6: " + ch);

        // String concatenation
        String newStr = str.concat(" How are you?");
        System.out.println("Concatenated String: " + newStr);

        // String comparison
        boolean isEqual = str.equals(newStr);
        System.out.println("Is original string equal to new string? " + isEqual);

        // strings are immutable in java. one of the most important thing. not just
        // strings but all the wrapper classes are immutable in java. so if we try to
        // change the string it will create a new string object in memory and return
        // that.
        String greet = "Hello World!";
        // now this and str are same so these will point to same memory location.
        // and if i try to change any one of these it will create a new string and
        // assign that memory reference to that variable.

    }
}
