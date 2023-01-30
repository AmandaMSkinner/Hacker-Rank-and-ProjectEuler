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
        Map<Long, Long> Collatz = new HashMap<Long, Long>();
        for (long i = 2; i <= Collections.max(tests); i++) {
            Collatz.put(i, CollatzCount(i, 0));
        }

        for (Long n : tests) {
            long maxValue=0;
            long maxSteps=0;
                for(long j=2;j<=n;j++){
                    if(Collatz.get(j)>=maxSteps){
                        maxValue=j;
                        maxSteps=Collatz.get(j);
                    }
                }
                System.out.println(maxValue);
            }
        }

    public static long CollatzCount(long n, long count) {
        if (n == 1) {
            return count;
        } else if (n % 2 == 0) {
            return CollatzCount(n / 2, count + 1);
        } else {
            return CollatzCount((3 * n + 1)/2, count + 2);
        }
    }
}