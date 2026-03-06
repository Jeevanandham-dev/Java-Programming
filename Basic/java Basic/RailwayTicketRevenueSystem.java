import java.util.Scanner;

public class RailwayTicketRevenueSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int genPass = obj.nextInt();
        int genFare = obj.nextInt();
        int acPass = obj.nextInt();   
        int acFare = obj.nextInt();
        int platform = obj.nextInt();
        int maintenance = obj.nextInt();
        int fuel = obj.nextInt();   
        obj.close();
        long value = (genPass * genFare) + (acPass * acFare)+ platform - maintenance - fuel;
        System.out.println("Net Railway Revenue: "+value);
    }
}
