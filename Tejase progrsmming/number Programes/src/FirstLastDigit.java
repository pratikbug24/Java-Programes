public class FirstLastDigit {
    public static void main(String[] args) {
        int num = 12345;
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        System.out.println("First Digit: " + first);
        System.out.println("Last Digit: " + last);
    }
}
