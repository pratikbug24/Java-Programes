public class HarshadCheck {
    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(n + " is Harshad (Niven)? " + isHarshad(n));
    }
}
