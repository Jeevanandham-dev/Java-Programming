import java.util.Scanner;

public class CinemaTheatrCollectionReport{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ticketRevenue = obj.nextInt();
        int snackRevenue = obj.nextInt();
        int maintenance = obj.nextInt();
        int electricity = obj.nextInt();
        obj.close();
        int value = ticketRevenue + snackRevenue - maintenance - electricity;
        System.out.println("Net profit:"+value);
    }
}