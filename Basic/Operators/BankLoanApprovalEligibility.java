import java.util.Scanner;

public class BankLoanApprovalEligibility {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int salary = obj.nextInt();
        int creditscore = obj.nextInt();
        obj.close();
        if(salary>25000 && creditscore>700){
            System.out.println("Loan approved");
        }
        else
        {
            System.out.println("Loan rejected");
        }
    }
}
