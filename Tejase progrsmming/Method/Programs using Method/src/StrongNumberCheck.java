public class StrongNumberCheck {
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
            num /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int n = 145;
        System.out.println(n + " is strong? " + isStrong(n));
    }
}
