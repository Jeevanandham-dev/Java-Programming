import java.util.Scanner;

public class WarehouseBoxCapacityDoublingSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int base = obj.nextInt();
        int level = obj.nextInt();
        obj.close();
        System.out.println(base<<level);
    }
}
