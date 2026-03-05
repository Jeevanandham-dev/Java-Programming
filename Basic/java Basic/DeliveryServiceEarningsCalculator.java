import java.util.Scanner;

public class DeliveryServiceEarningsCalculator {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       int deliveries = obj.nextInt();
       int payout = obj.nextInt();
       int incentive = obj.nextInt();
       int fuelcost = obj.nextInt();
       obj.close();
       int Earnings = (deliveries * payout) + incentive - fuelcost;
       System.out.println("Driver Earnings:"+Earnings);


    }
}
