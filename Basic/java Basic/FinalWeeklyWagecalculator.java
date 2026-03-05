import java.util.Scanner;

public class FinalWeeklyWagecalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int daysworked = obj.nextInt();
        int wageperday = obj.nextInt();
        int overtimeBonus = obj.nextInt();
        int maintanancecharge = obj.nextInt();
        obj.close();
        int wage = daysworked *wageperday;
        int bonus = wage + overtimeBonus;
        int deductcharge = bonus -maintanancecharge;
        System.out.println("final weekly pay:"+deductcharge);
    }
    
}
