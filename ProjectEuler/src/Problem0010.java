import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0010 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> tests = new ArrayList<>();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            tests.add(n);
        }
        List<Integer> primes = sieveOfEratosthenes(Collections.max(tests) * 2);
        for (int k : tests) {
            long sum = 0;
            int index = 0;
            while (primes.get(index) <= k) {
                sum = sum + primes.get(index);
                index++;
            }
            System.out.println(sum);
        }
    }

    //https://www.baeldung.com/java-generate-prime-numbers to generate list of primes up to Max N
    public static List<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        // Print all prime numbers
        primes.add(2);
        for (int i = 3; i <= n; i++) {
            if (i%2!=0&&prime[i] == true) {
                primes.add(i);
            }
        }
    return primes;}
}