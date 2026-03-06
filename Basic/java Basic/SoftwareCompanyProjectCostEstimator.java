import java.util.Scanner;

public class SoftwareCompanyProjectCostEstimator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int hours = obj.nextInt();
        int rate = obj.nextInt();
        int design = obj.nextInt();
        int test = obj.nextInt();
        int advance = obj.nextInt();
        int value = (hours * rate)+ design + test - advance;
        System.out.println("final Project Cost: "+value);
    }
}
