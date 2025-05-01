import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		String ans = num % 2 == 0 ? "Even" : "Odd";
		System.out.println(ans);
	}
}
