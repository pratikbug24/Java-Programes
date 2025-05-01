import java.util.Scanner;
class Cc{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("  welcome  ");
		System.out.println();
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println();
		System.out.println("Enter your responce");
		String str = sc.next().toUpperCase();
		System.out.println("Enter your Amount in INR");
		float inr = sc.nextFloat();
		float converted = 0;

		String curr = "VALID";
		switch(str)
		{
		case "USD":{
			converted = inr / 85.5165f;
			break;

		}
	case "EUR":{
         converted = inr / 97.4713f;
         break;

		}
	case "JPY":{
		converted = inr / 0.6026f;
		break;

	}
    case "KRW":{
    	converted = inr / 0.06002f;
    	break;

    }
 default:{
 	System.out.println("INVALID CURRENCY ENTERED");
 }
	}
if(curr.equals("VALID")){
		System.out.println(inr +"INR = "+ converted+ "" +str);
	}
	}
	
}

