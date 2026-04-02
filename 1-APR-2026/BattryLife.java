import java.util.*;

public class BattryLife {
    public static void main(String[] args) {

    Myclass class1 = new Myclass();
    int result = class1.BattryLife();
    System.out.println(result);
    }

}

 class Myclass {
    public int BattryLife() {
        Scanner sc = new Scanner(System.in);
        
        int mettingTiming = sc.nextInt();
        sc.nextLine();
        
        String line = sc.nextLine();
        String[] part = line.split(" ");

        int arr[]= new int[part.length];
        for(int i=0; i<part.length; i++){
            arr[i] = Integer.parseInt(part[i]);
        }

        int result=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > mettingTiming){
                result++;
            }
        }

        return result;

    }

    
}