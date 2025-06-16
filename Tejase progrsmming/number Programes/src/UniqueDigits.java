public class UniqueDigits {
    public static void main(String[] args) {
        int num = 123456;
        boolean[] seen = new boolean[10];
        boolean unique = true;
        while (num != 0) {
            int digit = num % 10;
            if (seen[digit]) {
                unique = false;
                break;
            }
            seen[digit] = true;
            num /= 10;
        }
        if (unique)
            System.out.println("All digits are unique");
        else
            System.out.println("Digits are not unique");
    }
}
