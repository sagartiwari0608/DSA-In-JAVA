package NumberSystems;

public class IsPrime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int number) {
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}

// this solution is way dumb and i thought too much here bc.
// this solution works but this is wayyyyy slower its that slow that time limit
// gets exceeded even java.
// class PrimeCounter {
// public int countPrimes(int n) {
// int counter = 0;
// // boolean isPrime = false;
// // if (n <= 1)
// // return 0;
// // for (int i = 2; i < n; i++) {
// // for (int j = 2; j <= i - 1; j++) {

// // if (i % j == 0) {
// // System.out.println(i + " i " + j + " j ");
// // isPrime = false;
// // break;
// // } else {
// // System.out.println("when true" + i + " i " + j + " j ");
// // isPrime = true;
// // }
// // }
// // if (isPrime) {
// // counter++;
// // }
// // }
// // return ++counter;
// }
// }