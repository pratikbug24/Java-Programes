import java.util.Scanner;
class  sum
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First number");
		 
		int n1 = sc.nextInt();
		
		System.out.println("Enter your second number");
		
		int n2 = sc.nextInt();
		
		int ans = n1 + n2;
		System.out.println("the sum of "+ n1 +" and " +n2 + " is :"+ ans);
	}
}
