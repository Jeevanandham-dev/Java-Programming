import java.util.Scanner;

public class HotelRoomRevenueCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int rooms = obj.nextInt();
        int price = obj.nextInt();
        int serviceCharges = obj.nextInt();
        int commission =obj.nextInt();
        obj.close();
        int value =  (rooms * price) + serviceCharges - commission;
        System.out.println("Total revenue:"+value);


    }
}
