import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int tem = num;
        int rev = 0;

        while(num > 0) {
            int r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }

        if(rev == tem) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
