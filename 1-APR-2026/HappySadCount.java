import java.util.Scanner;
public class HappySadCount {
 public static void main(String[] args) {
     Myclass class1 = new Myclass();
     class1.HappySadCount();
    
    }  
}

class Myclass {
    public void HappySadCount() {
        Scanner sc = new Scanner(System.in);
           
        int HappyCount=sc.nextInt();
        int Sadcount=0;

        int entretion=4;

        for(int i=0; i<=entretion;i++){
            double newHappy=0.7*HappyCount+0.5*Sadcount;
            double newSad=0.3*HappyCount+0.5*Sadcount;

            HappyCount=(int) newHappy;
            Sadcount=(int) newSad;
        }

        System.out.println(HappyCount+" "+Sadcount);
    }
}