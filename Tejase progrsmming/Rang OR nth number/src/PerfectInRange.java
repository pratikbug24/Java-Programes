public class PerfectInRange {
    public static void main(String[] args) {
        int start = 1, end = 1000;
        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
