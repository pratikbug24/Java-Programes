public class PerfectNumberCheck {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(n + " is perfect? " + isPerfect(n));
    }
}
