public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int product = 1;
        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }
        System.out.println("Product of digits: " + product);
    }
}
