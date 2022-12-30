import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Problem0004 {
    //Find the largest palindrome of two numbers that is less than N
    public static void main(String[] args) {
        int n = 800000;//Update to enter max number
        int maxPal=0;
        for(int i = 100;i<1000;i++){
            for(int j = 100;j<1000;j++){
                if(i*j>=n){break;}
                String palChk=Integer.toString(i*j);
                if(isPalindrome(palChk)&&(i*j)>maxPal){
                    maxPal=(i*j);
                }
            }
        }System.out.println(maxPal);
    }
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
