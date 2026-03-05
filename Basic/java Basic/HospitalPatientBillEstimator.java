import java.util.Scanner;
public class HospitalPatientBillEstimator{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int roomchargePerDay = obj.nextInt();
        int days = obj.nextInt();
        int medicineCost = obj.nextInt();
        int LabFees = obj.nextInt();
        int insuranceCoverage = obj.nextInt();
        int FinalBill =   (roomchargePerDay * days) + medicineCost + LabFees - insuranceCoverage;      
        System.out.println("Payable Amount:"+ FinalBill);
    }
}