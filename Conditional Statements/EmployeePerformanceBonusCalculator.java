import java.util.Scanner;

public class EmployeePerformanceBonusCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int PerRate = obj.nextInt();
        int YoS = obj.nextInt();
        String dept = obj.nextLine();
        double baseSal = obj.nextDouble();
        obj.close();
        System.out.println("performance: "+PerRate);
        System.out.println("Years Of Service: "+YoS);
        System.out.println("Department: "+dept);
        if(PerRate>=3){
            if(dept.equals("Critical")){
                if(PerRate==5 && YoS >=5){
                    System.out.println("");
                }
            }
        }
    }
}
