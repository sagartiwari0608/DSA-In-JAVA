package NumberSystems;

import java.util.Arrays;

/**
 * IsPrime
 */
public class IsPrime {

    public static int isPrime(int n) {
        boolean[] primes = new boolean[n + 1]; // because arrays start from 0 and we are going to use array's index as
                                               // values hence we need to go till n hence n+1;
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            System.out.println("outer loop" + i);
            if (primes[i]) {
                System.out.println("primes" + i);
                count++;
                for (int j = i * i; j <= n; j += i) {
                    System.out.println("primes false" + j);
                    primes[j] = false;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(20));
    }
}

// ################################### NAIVE SOLUTION
// #######################################
// public class IsPrime {
// public static boolean isPrime(int n) {
// if (n <= 1)
// return false;
// for (int i = 2; i <= (int) Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static int countPrimes(int number) {
// int counter = 0;
// for (int i = 2; i < number; i++) {
// if (isPrime(i)) {
// counter++;
// }
// }
// return counter;
// }

// public static void main(String[] args) {
// System.out.println(countPrimes(10));
// }
// }

// ###############################################################################
// to be ignored.####################################
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