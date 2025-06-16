public class PalindromeRange {
    public static void main(String[] args) {
        int start = 10, end = 200;
        for (int i = start; i <= end; i++) {
            int num = i, rev = 0, temp = num;
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if (rev == num) System.out.print(i + " ");
        }
    }
}
