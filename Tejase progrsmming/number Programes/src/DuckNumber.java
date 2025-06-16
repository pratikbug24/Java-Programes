import java.util.Scanner;
class DuckNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;

		while(temp>0){
               int digit = temp % 10;

              if (digit == 0) {
              	
              	System.out.println("Duck Number");
                 return;
                }
                temp = temp / 10;
              }
            
             	System.out.println("Not a Duck Number");

		}
	}
