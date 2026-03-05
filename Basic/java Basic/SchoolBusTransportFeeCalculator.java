import java.util.Scanner;

public class SchoolBusTransportFeeCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int dis = obj.nextInt();
        int rate = obj.nextInt();
        int maintanance = obj.nextInt();
        int allowance = obj.nextInt();
        int subsidy = obj.nextInt();
        obj.close();
        int value = (dis * rate) + maintanance + allowance - subsidy;
        System.out.println("Total transport fee:"+value);

    }
}
