import java.util.Scanner;

public class Problem0001 {
    //Find the sum of all the multiples of 3 or 5 below N.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        long n = in.nextLong();
        n = n - 1;
        long s3 = 3 * ((n / 3) * ((n / 3) + 1) / 2);
        long s5 = 5 * ((n / 5) * ((n / 5) + 1) / 2);
        long s15 = 15 * ((n / 15) * ((n / 15) + 1) / 2);
        System.out.print("The sum of all multiples of 3 or 5 below "+(n+1)+" is ");
        System.out.println(s3 + s5 - s15);
    }
}