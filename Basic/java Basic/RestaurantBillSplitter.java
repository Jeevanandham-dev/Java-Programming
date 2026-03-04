import java.util.*;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int totbill = obj.nextInt();
        int service = obj.nextInt();
        int gst = obj.nextInt();
        int nop = obj.nextInt();
        obj.close();
        float bill = totbill +(totbill *(service/100.0f)) + (totbill *(gst/100.0f));
        
        float Fbill = bill/nop;
        System.out.println("Amount per person:"+Fbill);
    
}
}