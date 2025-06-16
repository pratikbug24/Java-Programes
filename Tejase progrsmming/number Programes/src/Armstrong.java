public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == original)
            System.out.println(original + " is Armstrong");
        else
            System.out.println(original + " is not Armstrong");
    }
}
