import java.util.Scanner;

public class CollegeEventFundManagement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int registration = obj.nextInt();
        int  sponsorship = obj.nextInt();
        int stall = obj.nextInt();
        int stage = obj.nextInt();
        int celebrity  = obj.nextInt();
        int marketing = obj.nextInt();
        int value = registration+ sponsorship+ stall- stage- celebrity- marketing;
        System.out.println("Remaining Fund:"+value);


    }
}
