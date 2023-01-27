import java.io.*;
import java.math.BigInteger;
import java.util.*;
//Work out the first ten digits of the sum of N numbers.
//Used BigInteger and String
public class Problem0013 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<BigInteger> tests = new ArrayList<>();
        for (int a0 = 0; a0 < t; a0++) {
            String s = in.next();
            BigInteger a = new BigInteger(s);
            tests.add(a);
        }
        BigInteger sum=BigInteger.ZERO;
        for(BigInteger num : tests){
            sum=sum.add(num);
        }
        String sumStr = sum.toString();
        System.out.println(sumStr.substring(0,10));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}