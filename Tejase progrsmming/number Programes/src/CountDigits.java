public class CountDigits {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
