import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0008 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            int max = 0;
            for(int i = 0;i<n-k+1;i++){
                int test = 1;
                for(int j = i; j<i+k;j++){
                    test=test*Character.getNumericValue(num.charAt(j));
                }if(test>max){max=test;}
            }System.out.println(max);
        }
    }
}