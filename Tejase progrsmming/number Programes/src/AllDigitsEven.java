public class AllDigitsEven {
    public static void main(String[] args) {
        int num = 2486;
        boolean allEven = true;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                allEven = false;
                break;
            }
            num /= 10;
        }
        if (allEven)
            System.out.println("All digits are even");
        else
            System.out.println("Not all digits are even");
    }
}
