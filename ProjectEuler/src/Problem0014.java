import java.util.*;

public class Problem0014 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Long> tests = new ArrayList<>();
        for (int a0 = 0; a0 < t; a0++) {
        long n = in.nextInt();
        tests.add(n);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(Long n:tests){
            long maxCollatz=0;
            long maxNum=0;
            for(int i=2;i<=n;i++){
                if(Collatz(i)>=maxCollatz){
                    maxCollatz=Collatz(i);
                    maxNum=i;
                }
            }
            System.out.println(maxNum);
        }
    }
    public static long Collatz(int n){
        long count=0;
        while(n>1){
            if(n%2==0){
                n=n/2;
            }else{
                n=3*n+1;
            }
            count=count+1;
            //System.out.println("n="+n+" count="+count);//Watch the sequence
        }
        return count;
    }
}