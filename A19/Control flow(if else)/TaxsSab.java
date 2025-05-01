import java.util.Scanner;

 class TaxSlab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income (Rs.): ");
        double income = scanner.nextDouble();
        double tax = 0.0;
		double taxpay = 0.0; 

        if (income > 2400001) {
			taxpay=2400000 * 0.30;
           tax = (income - (2400000 * 0.30));
		   
        } else if (income > 2000001 && income <= 2400000) {
			taxpay = 2000000 * 0.25;
            tax = (income - (2000000 * 0.25));
        } else if (income > 1600001 && income<= 2000000) {
			taxpay = 1600000 * 0.20;
            tax = (income - (1600000 * 0.20));
        } else if (income > 1200000 && income <= 1600000 ) {
			taxpay=1200000 * 0.15;
           tax = (income - (1200000 * 0.15));
        } else {
            System.out.println("you have no need to pay tax ");
            tax = income;
        }

        System.out.println("Tax to be pay: Rs."+ taxpay);
		System.out.println("After paying tax your income is: Rs"+tax);
        scanner.close();
    }
}
