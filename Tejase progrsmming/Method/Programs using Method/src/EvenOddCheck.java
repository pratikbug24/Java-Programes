public class EvenOddCheck {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + " is even? " + isEven(n));
    }
}
