import java.util.*;
public class GroceryStoreDetails{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sales=obj.nextInt();
        int discount = obj.nextInt();
        int gst = obj.nextInt();
        obj.close();
        float bill = sales-(sales*(discount/100.0f));
        float totBill = bill+(bill*(gst/100.0f));
        System.out.println("Final revenue: "+totBill);
    }

}