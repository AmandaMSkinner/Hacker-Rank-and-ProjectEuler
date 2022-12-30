import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0005 {
    // 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    //What is the smallest positive number that is evenly divisible(divisible with no remainder) by all the numbers from 1 to N?
    public static void main(String[] args) {
        int n = 10;
        int max = 1;
        for (int i = 1; i <= n; i++) {
            max = max * i;//Find n!
        }
        int small = 0;
        boolean check = true;
        for (int j = n; j <= max; j++) {
            check = true;
            small = j;
            for (int k = 1; k <= n; k++) {
                if (j % k != 0) {
                    check = false;
                }
            }
            if (check == true) {
                System.out.println(small);
                break;
            }
        }
    }
}
