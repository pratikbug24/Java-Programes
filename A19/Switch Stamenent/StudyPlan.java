import java.util.Scanner;

public class StudyPlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
	   System.out.println("----------------------------------------------------------Wellcome----------------------------------------------------------------");
	   
        System.out.print("Enter a day number (1 to 7): ");
        int day = scanner.nextInt();

        System.out.println("\nDay " + day + " Study Plan:");

        switch (day) {
            case 1:
                System.out.println(" - Math: Algebra & Calculus");
                break;
            case 2:
                System.out.println(" - Physics: Kinematics & Laws of Motion");
                break;
            case 3:
                System.out.println(" - Chemistry: Organic Chemistry");
                break;
            case 4:
                System.out.println(" - Biology: Human Physiology");
                break;
            case 5:
                System.out.println(" - Physics: Thermodynamics");
                break;
            case 6:
                System.out.println(" - Chemistry: Chemical Reactions");
                break;
            case 7:
                System.out.println(" - Revision: All Subjects");
                break;
            default:
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
