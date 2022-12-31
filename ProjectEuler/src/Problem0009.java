import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0009 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(pythTrip(n));
        }
    }
    public static int pythTrip(int n) {
        int maxProduct = -1;
        if (n % 2 == 1) {//Pythagorean triples ALWAYS sum to even numbers
            return maxProduct;
        }
        int maxA = (n - 4) / 8 * 4;
        for (int a = maxA; a >= 4; a -= 4) {
            if ( (n * (n - 2 * a)) % (2 * (n - a)) == 0) {
                int b = (n * (n - 2 * a)) / (2 * (n - a));
                maxProduct = Math.max(maxProduct, a * b * (n - a - b));
            }
        }
        return maxProduct;
    }
}