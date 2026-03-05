import java.util.Scanner;

public class FuelCostTripCalculator {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int dis = obj.nextInt();
        int mileage = obj.nextInt();
        int fuelprice = obj.nextInt();
        int tollcharge = obj.nextInt();
        obj.close();
        float rdis = dis/mileage;
        float tfuelprice = rdis*fuelprice;
        float tcost = tfuelprice + tollcharge;
        int Tcost =(int)tcost;
        System.out.println(Tcost);



    }
    
}
