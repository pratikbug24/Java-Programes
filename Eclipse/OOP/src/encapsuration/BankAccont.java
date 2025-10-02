package encapsuration;

public class BankAccont {
  
	private String name ;
	private String bankName ;
	private long phno ;
	private String ifsc ;
	private double balance;
	private long accno ;
	private String address ; 
	private long aadhar ;
	private int pin ;
	private String branch ;
	
	public BankAccont() {
	
		
	}
	
	 BankAccont(String name,String bankName,long phno,String ifsc,double balance,long accno, String address, 
			 long aadhar, int pin, String branch)
	 {
			this.name = name ;
			this.bankName = bankName ;
			this.phno = phno ;
			this.ifsc = ifsc ;
			this.balance = balance ;
			this.accno = accno ;
			this.address = address ;
			this.aadhar = aadhar ;
			this.pin = pin ;
			this.branch = branch ;
			System.out.println("Account created");
	 }
			
		public String getName() {
			return name ;
			}
		
		public String getBankName()
		{
		  return bankName ;
		}
		public long getPhno()
		{
		   return phno ;
        }
		public String getifsc() 
		{
		  return ifsc ;
		}
		public long getAccno()
		{
		   return accno ;
		}
		public String getaddress()
		{
			return address;
		}
		
		public long getaadhar()
		{
			return aadhar;
		}
		
		public void setPin(long accno, int oldPin,int newPin)
		{
		if(this.accno==accno && pin==newPin)
		System.out.println("Pin alrady usedl");
		else if (this.accno == accno && pin==oldPin ) 
		{
		pin = newPin ;
		
		System.out.println("Pin Updated");
		}
		else {
			System.out.println("Invalid crediantial");
		}
		}
		public String getbranch()
		{
			return branch;
		}
		
		public double getBalance(long accno,int pin)
		{
			if(this.accno==accno && this.pin == pin)
			{
				return balance;
			}
			System.out.println("Invalid credentialsi");
			return 0 ;
		}
		
	public void withdraw(long accno, int pin,double amt)
	{
		  if (this.accno==accno && this.pin==pin) 
		  {
		    System.out.println("Login success");
		      if (amt>0 && balance-amt>1000) 
		     {
		       balance = balance - amt ;
		       System.out.println("Amount debltedl");
		       System.out.println("Your balaace: "+balance);
		     }	
		    else
		    {
			  System.out.println("Insufficient balancel");
		    }
	     }
		 else
		 {
			 System.out.println("invalid credential");
		 }
	 }

	public void deposit(long accno, int pin,double amt)
	{
		if (this.accno==accno && this.pin == pin) 
		{
			System.out.println("Legia successl");
	    		if (amt>0 ) 
				{
			        balance = balance + amt ;
			        System.out.println("Your balance: "+balance);
			        System.out.println("Amount creditedl");
			     }
			     else
			     {
			       System.out.println("Invalid amounti");
			     }
		  }
		else
		{
			System.out.println("invalid credentialsl");
		}
   }
}
     

