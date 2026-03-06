import java.util.Scanner;

public class AgricultureFarmYieldCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int yieldPerAcre = obj.nextInt();
        int acres = obj.nextInt();
        int extraYield= obj.nextInt();
        int damagedCrops = obj.nextInt();
        obj.close();
        int value = (yieldPerAcre * acres) + extraYield - damagedCrops;
        System.out.println("Marketable yield:"+value);
    }
}
