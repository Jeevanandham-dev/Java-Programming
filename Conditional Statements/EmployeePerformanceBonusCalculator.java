import java.util.Scanner;

public class EmployeePerformanceBonusCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int PerRate = obj.nextInt();
        int YoS = obj.nextInt();
        obj.nextLine();
        String dept = obj.nextLine();
        double baseSal = obj.nextDouble();
        obj.close();
        System.out.println("performance: "+PerRate);
        System.out.println("Years Of Service: "+YoS);
        System.out.println("Department: "+dept);
        float dis=0;
        int bonusper=0;
        if(PerRate>=3){
            if(dept.charAt(0)=='c'){
                if(PerRate==5 && YoS >=5){
                    bonusper = 25;
                    dis = 25/100.2f;
                }
                else if(PerRate == 4 && YoS >= 10){
                    bonusper=22;
                    dis = 22/100.2f;
                }
                else if(PerRate == 4 && YoS<5){
                    bonusper = 15;
                    dis = 15/100.2f;
                }
                else if( PerRate == 3){
                    bonusper = 10;
                    dis = 10/100.2f;
                }
                else{
                    bonusper = 0;
                    dis = 0;
                }
                
            }
            else {
                if(PerRate == 5){
                    bonusper = 18;
                    dis = 18/100.0f;
                }
                else if(PerRate == 4){
                    bonusper = 12;
                    dis = 12/100;
                }
                else if(PerRate == 3){
                    bonusper = 8;
                    dis = 8/100.0f;
                }
                else{
                    bonusper = 0;
                    dis =0;
                }
            }
        }
        System.out.println("Bonus: "+bonusper);
        System.out.println("Bonus Amount: "+baseSal*dis);

        if(dis == 0){
            System.out.println("Status: Not Eligible");
        }
        else{
            System.out.println("Status: Eligible");
        }
        
    }
}
