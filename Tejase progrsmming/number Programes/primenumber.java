import java.util.Scanner;
class primenumber
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		String ans = (num<2) ?
		(" is not prime"): 
		((num%2!=0 || num%3!=0 || num%5!=0 || num%7!=0))?
		(num + " is prime"):((num==2 || num==3 || num==5 || num==7))?
		(num +" is prime"):
		(num +"  is not prime");
		
		
		System.out.println(ans);
    }  
}