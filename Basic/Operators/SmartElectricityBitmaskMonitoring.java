import java.util.Scanner;

public class SmartElectricityBitmaskMonitoring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int conVal = obj.nextInt();
        int app = obj.nextInt();
        obj.close();
        if((conVal & app )!=0){
            System.out.println("active");
        }
        else{
            System.out.println("Inactive");
        }
    }
}
