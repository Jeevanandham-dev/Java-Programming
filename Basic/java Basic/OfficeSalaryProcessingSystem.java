import java.util.Scanner;

public class OfficeSalaryProcessingSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int basic = obj.nextInt();
        int hra = obj.nextInt();
        int bonus = obj.nextInt();
        int tax = obj.nextInt();
        int pf = obj.nextInt();
        obj.close();
        int value = basic + hra + bonus - tax - pf;
        System.out.println("Take home Salary:"+value);
    }
    
}
