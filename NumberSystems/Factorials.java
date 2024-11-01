package NumberSystems;

public class Factorials {
    // we will try with recursion.
    static int factorials(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return n * factorials(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorials(3));
    }
}
