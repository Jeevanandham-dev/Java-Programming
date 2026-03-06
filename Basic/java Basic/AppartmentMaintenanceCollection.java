import java.util.Scanner;

public class AppartmentMaintenanceCollection {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int maintenance = obj.nextInt();
        int park = obj.nextInt();
        int hall = obj.nextInt();
        int security = obj.nextInt();
        int elec = obj.nextInt();
        int clean = obj.nextInt();
        obj.close();
        int val = maintenance+ park+ hall- security- elec- clean;
        System.out.println("remaining balance:"+val);
    }
}
