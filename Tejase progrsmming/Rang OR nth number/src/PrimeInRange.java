public class PrimeInRange {
    public static void main(String[] args) {
        int start = 10, end = 50;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i <= 1) isPrime = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }
}
