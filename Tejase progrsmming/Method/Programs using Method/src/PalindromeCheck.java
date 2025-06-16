public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        int rev = 0, temp = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(n + " is palindrome? " + isPalindrome(n));
    }
}
