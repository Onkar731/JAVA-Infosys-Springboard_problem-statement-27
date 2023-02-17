public class SumN {
    public static long calculateSum(int N) {
        long sum = 0;

        for(int i = 1; i <= N; i++) {
            sum += i;
        }

        // returning sum
        return sum;
    }
}