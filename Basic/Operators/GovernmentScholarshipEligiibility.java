import java.util.Scanner;

public class GovernmentScholarshipEligiibility {

    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         int familyIncome = obj.nextInt();
         int per = obj.nextInt();
         obj.close();
         if(familyIncome<200000 && per>=75){
            System.out.println("Scholarship granted");
         }
         else{
            System.out.println("Not granted");
         }
    }
}