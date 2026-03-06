import java.util.Scanner;
public class CarRentalCompanyProfitCalculator{
   public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
       int days = obj.nextInt();
       int rent = obj.nextInt();
       int late = obj.nextInt();
       int fuel = obj.nextInt();
       int maintenance = obj.nextInt();
       obj.close();
       int value = (rent * days)+ late- fuel- maintenance;
       System.out.println("Net profit: "+value);
       
   } 
}