import java.util.Scanner;

public class EcommerceFreeShippingEligibility {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Cval = obj.nextInt();
        int Pmember = obj.nextInt();
        obj.close();
        if(Cval> 999 || Pmember==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Shipping charges Applied");
        }

    }
}
