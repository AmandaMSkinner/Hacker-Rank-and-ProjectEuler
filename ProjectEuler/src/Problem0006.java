import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0006 {
    //Find the absolute difference between the sum of the squares of the first N natural numbers and the square of the sum.
    public static void main(String[] args) {
        int n = 10;
        long sumSquares = 0;
        long squareSum = 0;
        for(long i=1;i<=n;i++){
            sumSquares=sumSquares+(i*i);
            squareSum=squareSum+i;
        }squareSum*=squareSum;
        System.out.println(Math.abs(sumSquares-squareSum));
    }
}
