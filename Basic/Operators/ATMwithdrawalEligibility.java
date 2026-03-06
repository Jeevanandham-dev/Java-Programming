import java.util.Scanner;

public class ATMwithdrawalEligibility {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int accbal = obj.nextInt();
        int wAmount = obj.nextInt();
        int Dlimit = obj.nextInt();
        obj.close();
        if(wAmount<=accbal && wAmount<=Dlimit){
            System.out.println("transaction Successful");
        }
        else{
            System.out.println("transaction unsuccessful");
        }

    }
}
