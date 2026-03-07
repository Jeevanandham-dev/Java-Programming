import java.util.Scanner;

public class CreditCardPurchaseValidation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Climit = obj.nextInt();
        int pAmount = obj.nextInt();
        int Cblock= obj.nextInt();
        obj.close();
        if(pAmount<= Climit && Cblock==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Not approved");
        }
    }
}
