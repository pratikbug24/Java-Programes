public class AutomorphicCheck {
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static void main(String[] args) {
        int n = 76;
        System.out.println(n + " is automorphic? " + isAutomorphic(n));
    }
}
