import java.util.Scanner;

public class EcommerceDynamicDiscountSystem {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String tier = obj.nextLine();
        float cart = obj.nextFloat();
        obj.nextLine();
        String Category = obj.nextLine();
        String status = obj.nextLine();
        obj.close();

        float dis = 0;
        float aDis = 0;
        float cDis = 0;

    if(tier.equalsIgnoreCase("bronze"))
        dis =  5;
    if(tier.equalsIgnoreCase("silver"))
        dis =  8;
    if(tier.equalsIgnoreCase("gold"))
        dis = 12;
    if(tier.equalsIgnoreCase("platinum"))
        dis = 15;

    if(cart>=500 && cart<1000)
        aDis = 3;
    if(cart>=1000 && cart<2000)
        aDis = 5;
    if(cart>=2000)
        aDis = 7;

    if(Category.equalsIgnoreCase("electronics") && status.equalsIgnoreCase("prime"))
        cDis = 5;
    if(Category.equalsIgnoreCase("fashion"))
        cDis = 3;
    if(Category.equalsIgnoreCase("books") && status.equalsIgnoreCase("prime"))
        cDis = 5;
    if(Category.equalsIgnoreCase("Groceries") && cart>300)
        cDis = 2;
    
    float tDis = dis + aDis + cDis;

    System.out.println("\n");

    System.out.println("Loyalty Tier: "+tier);
    System.out.println("Cart value: "+cart);
    System.out.println("Product category: "+Category);
    System.out.println("Membership: "+status);
    System.out.println("Base Discount: "+ dis);
    System.out.println("Additional Discount: "+ (aDis+cDis));
    System.out.println("Total Discount: "+tDis);
    
    float fPrice = cart * (1 - tDis/100.0f);
    
    System.out.println("Final Price: "+fPrice);
    System.out.println("Savings: "+(cart - fPrice));
   





    }
}
