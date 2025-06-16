public class ArmstrongRange {
    public static void main(String[] args) {
        int start = 100, end = 999;
        for (int i = start; i <= end; i++) {
            int num = i, sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
