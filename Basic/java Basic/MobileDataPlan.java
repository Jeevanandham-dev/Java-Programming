import java.util.*;
public class MobileDataPlan{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int base = obj.nextInt();
        int extraGB = obj.nextInt();
        int ratePerGB = obj.nextInt();
        int tax = obj.nextInt();
        obj.close();
        
        
        float extraCharge = extraGB * ratePerGB;
        float subtotal = base + extraCharge;
        float totalBill = subtotal + (subtotal * tax / 100);

        System.out.println("Total Bill = " + totalBill);
        


    }
}