public class HappyCheck {
    public static boolean isHappy(int num) {
        int slow = num, fast = num;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(n + " is Happy? " + isHappy(n));
    }
}
