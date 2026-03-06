import java.util.Scanner;

public class AirlineCargoRevenueSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int weight = obj.nextInt();
        int rate = obj.nextInt();
        int prio = obj.nextInt();
        int ins = obj.nextInt();
        int hand= obj.nextInt();
        int fuel = obj.nextInt();
        obj.close();
        int val = (weight *rate)+ prio + ins- hand - fuel;
        System.out.println("Cargo value:"+val);

    }
}
