public class NeonCheck {
    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int n = 9;
        if(isNeon(n)){
        System.out.println(n + " is Neon");
        }
        else{
        System.out.println(n + " is not Neon");
        }
    }
}
