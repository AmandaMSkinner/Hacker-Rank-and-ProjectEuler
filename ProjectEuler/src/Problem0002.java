import java.util.Scanner;

public class Problem0002 {
    //By considering the terms in the Fibonacci sequence whose values do not exceed N,
    //find the sum of the even-valued terms.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = scan.nextLong();

        long fibSum0 = 0;
        long fibSum1 = 1;
        long fibTotal = 1;

        long evenFibSum = 0;
        while(fibTotal<n) {
            if(fibTotal%2==0){
                evenFibSum=evenFibSum+fibTotal;
            }
            fibSum0 = fibSum1;
            fibSum1 = fibTotal;
            fibTotal = fibSum1 + fibSum0;
        }
        System.out.println("The sum of even fibonacci numbers less than "+n+" is "+evenFibSum);
    }
}
