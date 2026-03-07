import java.util.Scanner;

public class DigitalSignalToggle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sigVal = obj.nextInt();
        int toggleMask = obj.nextInt();
        obj.close();
        System.out.println("Toggled Signal: "+(sigVal ^ toggleMask));
    }
}
