public class ArmstrongCheck {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int r = num % 10;
            sum += Math.pow(r, digits);
            num /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(n + " is Armstrong? " + isArmstrong(n));
    }
}
