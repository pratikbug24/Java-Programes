public class Harshad {
    public static void main(String[] args) {
        int num = 18;
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num % sum == 0)
            System.out.println(num + " is Harshad Number");
        else
            System.out.println(num + " is not Harshad Number");
    }
}
