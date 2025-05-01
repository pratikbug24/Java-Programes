import java.util.Scanner;

class EVM
   {
    static int bjp ,mns, ss, ncp, nota ;
	
     public static void main(String[] args)
	 {

       Scanner sc = new Scanner(System.in);

       System.out.println("_________WELCOME___________");

       System.out.println();
      System.out. print("Enter the Population : ");
      int pop = sc.nextInt(); // 10

        System.out.println();
       for(int i=1 ;i <= pop; i++)
		   {
		   
          System. out. println();
          System. out. println("LIST OF PARTIES ");
          System.out.println("1. BJP");
          System.out.println("2. MNS");
	      System.out.println("3.SHIVSENA");
	      System.out.println("4.NCP");
		  System.out.println("5.NOTA.");
		  System.out.println();
		  System.out.print("Enter your voat:  ");
		  String response = sc.next().toUpperCase();
		  switch (response)
		  {
		  case "BJP":{
			  
			  bjp++;
			  System.out.println("YOU HAVE GIVE VOTE TO BJP");
			  System.out.println("ACCHE DIN AYENGE");
			  break;
			  
			  }
			  case "MNS":{
			  
			  mns++;
			  System.out.println("YOU HAVE GIVE VOTE TO MNS");
			  System.out.println("JAI MAHARASTRA");
			  break;
			  
			  }
			  case "SHVSENA":{
			  
			  ss++;
			  System.out.println("YOU HAVE GIVE VOTE TO SHIVESENA");
			  System.out.println("WE ARE REAL SENA");
			  break;
			  
			  }
			  case "NCP":{
			  
			  ncp++;
			  System.out.println("YOU HAVE GIVE VOTE TO NCP");
			  System.out.println("RASHTRAWADI PUNHA");
			  break;
			  
			  }
			  case "NOTA":{
			  
			  nota++;
			  System.out.println("YOU HAVE GIVE VOTE TO NOTA");
			  System.out.println("YOU ARE GRNIOUS");
			  break;
			  
			  }
		  default:{
			  
			  
			  System.out.println("INVALIDE PARTY NAME");
			  i--;
			  break;
			  
			  }
			  
		  }
		}
	 
		  if(bjp>=mns && bjp>=ss &&bjp>=ncp && bjp>=nota)
           System.out. println("BJP HAS WON THE ELECTION BY : "+bjp+" votes" );
           else if(mns>=bjp && mns>=ss && mns>=ncp && mns>=nota)
             System.out.println("MNS HAS WON THE ELECTION BY :"+mns+" votes" ) ;
           else if(ss>=bjp && ss>=mns && ss>=ncp && ss>=nota)
             System.out.println("SS HAS WON THE ELECTION BY : "+ss+"votes" );
           else if(ncp>=bjp && ncp>=ss && ncp>=mns && ncp>=nota)
            System.out.println("NCP HAS WON THE ELECTION BY : "+ncp+"votes");
			else 
            System.out.println("NOTA HAS WON THE ELECTION BY : "+nota+" votes");
		   }
   }
   
   