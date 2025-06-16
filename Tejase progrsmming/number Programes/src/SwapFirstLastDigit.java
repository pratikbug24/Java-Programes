public class SwapFirstLastDigit {
    public static void main(String[] args) {
        int num = 12345;
        String str = Integer.toString(num);
        if (str.length() == 1) {
            System.out.println("Swapped Number: " + str);
        } else {
            char[] arr = str.toCharArray();
            char temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
            System.out.println("Swapped Number: " + new String(arr));
        }
    }
}
