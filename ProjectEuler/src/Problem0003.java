import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem0003 {
    //What is the largest prime factor of a number N?

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scan.nextLong();
        List<Long> factors = new ArrayList<Long>();
        //d represents the divisor
        long d = 2;
        while (n > 1) {
            while (n % d == 0) {
                factors.add(d);//if d is a factor, add to the list
                n /= d;//divide n by d to continue searching for factors
            }
            d = d + 1; //increment d to look for larger factors
            if (d * d > n) {
                if (n > 1) {
                    factors.add(n);
                    break;
                }
            }
        }
        //Iterate through list of prime factors to get the largest:
        long max = factors.get(0);
        for(int j=0;j<factors.size();j++){
            if(factors.get(j)>max){
                max=factors.get(j);
            }
        }
        System.out.print(max);
    }
}