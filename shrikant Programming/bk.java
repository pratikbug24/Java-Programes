import java.util.*;
class bk
{
		static String name ; // null
        static String email ; // null
        static String address ; // null
        static double bal ; // 0.0

        static int pin ; // 0
        static String contact ; // 0
        static Long adhar ; // 0
        static String panCard ; // null
        static Long accountNumber = 1234_1234_1234L;

        static String ifscCode = "LCF0009211";

        static ArrayList<String> statement = new ArrayList<String>();

   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
            welcomeLoop:
    for (; ; )
        {
                System.out.println();
                System.out.println("-----------WELCOME---------");
                System.out.println("");
                System.out.println("LAXMI CHIT FUND");
                System.out.println();
                System.out.println("Create a account");
                System.out.println("Existing User");
                System.out.println("Enter your choise");
        switch(sc.nextInt())
                {
                   case 1:
                        {
                             System.out.println();
                             System.out.println("CREATE ACCOUNT" );

                             sc.nextLine();
                             System.out.print("USername : ");
                             name = sc.nextLine();
                             System.out.print("Email");
                             email = sc.next();
                             System.out.println("Address");
                             sc.nextLine();
                             address = sc.nextLine();
                             System.out.println("Adhar No");
                             adhar = sc.nextLong();
                             System.out.print("Pan Number :");
                             panCard = sc.next();
                             System.out.print("Contact Number : ");
                             contact = sc.next();
                             System.out.print("Pin: ");
                             pin= sc.nextInt();
                             System.out.print("Enter an amount (Deposit) :");
                             bal = sc.nextDouble();
                             statement.add("Deposit : "+ bal+"rs (Account Creation");
                             System.out.println();
                             System.out.println("ACCOUNT CREATED SUCCESSFULLY");
                             System.out.println();
                             break;
                         }
                         case 2:
                            {
                         if(name==null)
                           {
                               System.out.println();
                               System.out.println( "CREATE YOUR ACCOUNT FIRST");
                               break ;
                           }
                           System.out.println();
                               System.out.println("LOGIN");
                               for(int i =3;i>=1;i -- )
                               System.out.println();
                               System.out.print( "Username/Phone : ");
                               String cred1 = new Scanner(System.in).next();
                               System.out.println( "Pin : ");
                               int cred2 = new Scanner(System.in).nextInt();
                               System.out.println();
                    
                   if((cred1.equals(name)||cred1.equals(contact))&&(cred2==pin));
                    {
                       homePage:
                     for (; ; )
                     {
                         System.out.println();
                                              System.out.println("  Home Page");
                                             System.out.println("");
                                            System.out.println("");
                                            System.out.println("1. Deposit Amount");
                                            System.out.println("2. Withdraw Amount");
                                            System.out.println("3. Check Balance");
                                            System.out.println("4. Statment");
                                            System.out.println("5. Loan");
                                            System.out.println("6. Profile");
                                            System.out.println("7. Logout");
                                            System.out.println();
                                            System.out.print("Enter your option : ");
                                            int opt = new Scanner(System.in).nextInt();
                                            System.out.println("");
            
              switch(opt){
                     case 1:{
                                System.out.println("DEPOSIT MODULE");
                                System.out.println();
                                System.out.print("Enter your amount : ");
                                double depAmt = new Scanner(System.in).nextDouble();
                                bal += depAmt; // balance updated
                                System.out.println("Amount Deposited SUCCESSFULLY");
                                statement.add("Deposit : "+depAmt+"Rs");
                                        break;
                           }
                            case 2:
                              {
                                        System.out.println("WITHDRAN MODULE");
                                        System.out.println("Enter your Amount : ");
                                        double withAmt = new Scanner(System.in).nextDouble();  
                                        System.out.print("Enter your Pin : ");
                                        int pin1 = new Scanner(System.in).nextInt();
                                    if(pin1==pin)
                                    {
                                         if(withAmt>=bal)
                                         {
                                            bal -= withAmt;
                                           System.out.println("Amount DebITED SUCESSFULLY");
                                           statement.add("Debited :"+withAmt+"Rs");
                                          }
                                          else
                                          {
                                             System.out.println("INSUFFICIENT FUNDS");
                                         }
                                    }
                                        else 
                                        {
                                           System.out.println("Invalid Pin");
                                           break ;
                                         }
                                }
                            case 3:
                                {
                                        System.out.println("CHECK BALANCE MODULE");
                                        for(int j=3;j>=1;j--)
                                        {
                                                System.out.println();
                                                System.out.print("Enter your pin : ");
                                                int pin1 = new Scanner(System.in).nextInt();
                                            if(pin==pin1)
                                            {
                                                System.out.println("Your account Balance");
                                                continue homePage;
                                           }
                                            else
                                            {
                                                System.out.println("INVALID PIN");
                                                System.out.println("Attempt left : "+(j-1));
                                            }
                                         }
                                         System.out.println("ITS NOT YOUR ACCOUNT");
                                         System.out.println("ACCOUNT BLOCKED FOR 24 HOURS");
                                         System.exit(0);
                                         break;
                                }
                                case 4:
                                {
                                    System.out.println("Statment MODULE");
                                    System.out.println();
                                    for(String s : statement)
                                    {
                                        System.out.println(s);
                                    }
                                    break;
                                }
                            case 5:
                                {
                                    System.out.println("loan MODULE");
                                    break;
                                }
                                case 6:{
                                System.out.println("PROFILE MODULE");
                                System.out.println("Username : "+name);
                                break ;
                                }
                                case 7:{
                                System.out.println("THANK U VISIT AGAIN");
                                System.exit(0); // terminate the exec
                                 }
                                default:{
                                System.out.println("INVALID OPTION ");
                                break ;
                                 }
                        }
                    }   
}
 }   
  }
}
}
 }    
        
    

