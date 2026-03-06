import java.util.Scanner;

public class GymTrainerMonthlySalary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int baseSalary = obj.nextInt(); 
        int sessions = obj.nextInt();
        int payPerSession = obj.nextInt();
        int bonus = obj.nextInt(); 
        int maintenanceFee = obj.nextInt();
        obj.close();
        int value = baseSalary + (sessions *payPerSession) + bonus - maintenanceFee;
        System.out.println("Final Salary:"+value);
    }
}
