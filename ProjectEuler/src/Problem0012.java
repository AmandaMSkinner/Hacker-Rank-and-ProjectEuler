import java.io.*;
import java.util.*;

public class Problem0012 {
    //What is the first triangle number to have over N divisors?
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> tests = new ArrayList<>();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            tests.add(n);
        }
        //Generate list of triangle numbers
        long tri = 1;
        List<Long> triNum = new ArrayList<>();
        triNum.add(tri);
        for (long i = 2; i < 10000; i++) {
            tri = tri + i;
            triNum.add(tri);
        }
        //Check if a triangle number has >N divisors
        for (long num : tests) {
            outerloop: //Labeling a loop lets you break out.
            for (long triValue : triNum) {
                long count = 0;
                    for (long j = 1; j < triValue; j++) {
                        if (triValue % j == 0) {
                            count = count + 1;
                    }if(count>=num){
                            System.out.println(triValue);
                            break outerloop;
                        }
                }
            }
        }
    }
}