package encapsuration;

public class BankAccontDriver 
{

		public static void main(String[]args) 
		{

		  BankAccont b1 = new BankAccont("Raju","ICICI",938765434,"icici1234",
				300000.0,1234567891, "Pune",56781234,1234, "Deccan") ;
	   	  System.out.println(b1.getBalance(1234567891,1234));
		  b1.withdraw(1234567891,1234,100.0);
		  b1.setPin(1234567891,1234,9876);
		  b1.deposit(1234567891,9876,1003);

      }
}
