import java.util.Scanner;

public class EmployeeOvertimeBonusEligibility {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int wHours = obj.nextInt();
        int AP = obj.nextInt();
        obj.close();
        if(wHours>40 && AP>90){
            System.out.println("Bonus Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
