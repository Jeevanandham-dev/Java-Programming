import java.util.Scanner;

public class SystemLoginAunthetication {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int username = obj.nextInt();
        int password = obj.nextInt();
        int account = obj.nextInt();
        obj.close();
    if((username==1 && password == 1) && account== 0){
        System.out.println("Login success");
    }
    else{
        System.out.println("Login failed");
    }
}
}
