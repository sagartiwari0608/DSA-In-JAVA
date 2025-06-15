package ImportantAlgos;

public class GCD {
    // there are multiple ways to solve this problem
    // first method most naive. take the minimum of the 2 elements and then keep
    // reducing it untill it divided and leaves 0 remainder for both.

    public int gcdBruterForce(int a, int b) {

        // edge cases. if one of them is zero then zero can be multiplied with any
        // number and the other number will be gcd
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                return result;
            } else {
                result--;
            }
        }
        return 1;
    }

    public int gcdEuclidean(int a, int b) {
        // edge cases
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;
        if (a > b) {
            return gcdEuclidean(a - b, b);
        } else {
            return gcdEuclidean(a, b - a);
        }

    }

}
