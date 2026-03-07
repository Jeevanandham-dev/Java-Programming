import java.util.Scanner;

public class SecurityPermissionManagement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int perA = obj.nextInt();
        int perB = obj.nextInt();
        obj.close();
        System.out.println("Merged Permission Code: "+(perA|perB));
    }
}
