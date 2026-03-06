import java.util.*;

public class OnlineExamPassEvaluation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int theory = obj.nextInt();
        int Pmarks = obj.nextInt();
        obj.close();
        int avg = (theory+Pmarks)/2;
        if(theory>= 50 && Pmarks>=50){
            if(avg>=60){
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
            }
        }
        else{
            System.out.println("fail");
        }

    }    
}
