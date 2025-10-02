package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exp1 {
	
	public static void main(String[]args) 
   {
		try 
		{
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter a numreter");
	
	     int num=sc.nextInt();
	  
	     System.out.println("Enter a denominater");
	     int den=sc.nextInt();
	  
	    int ans= num/den;
	    System.out.println(ans);
      }
		catch (ArithmeticException e) {
			
			System.out.println("Don't Divided by Zero");
		}
		catch (InputMismatchException e) {
			System.out.println("Wrong input to Scanner");
		}
		catch(Exception e) {
			System.out.println("UnExcepted Erro Occured");
		}
		finally {
			System.out.println("Visit Again");
		}
		System.out.println("Thank You");
   }

}
