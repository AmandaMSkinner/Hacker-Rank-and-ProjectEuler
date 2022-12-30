import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0007 {
    //Find the nth prime;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Long> tests = new ArrayList<Long>();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            tests.add(Long.valueOf(n));
        }
        //Generate a list of primes
        ArrayList<Long> primes = new ArrayList<Long>();
        long i = 0;
        while(primes.size()<Collections.max(tests)){
            i++;
            if (isPrime(i)) {
                primes.add(Long.valueOf(i));
            }
        }
        for(long k : tests){
            System.out.println(primes.get((int)(k-1)));
        }
    }

    //function to check if a given number is prime
    static boolean isPrime(long n){
        //since 0 and 1 is not prime return false.
        if(n==1||n==0)return false;
        //Run a loop from 2 to n-1
        for(long i=2; i<n; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(n%i==0)return false;
        }
        return true;
    }
}