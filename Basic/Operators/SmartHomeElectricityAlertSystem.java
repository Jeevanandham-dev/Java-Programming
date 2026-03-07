import java.util.Scanner;

public class SmartHomeElectricityAlertSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int units = obj.nextInt();
        int vol = obj.nextInt();
        obj.close();
        if(units>500 || vol==1){
            System.out.println("normal");
        }
        else{
            System.out.println("Alert");
        }
    }
}
