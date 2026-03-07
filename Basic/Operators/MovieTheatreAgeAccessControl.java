import java.util.Scanner;

public class MovieTheatreAgeAccessControl {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        int id = obj.nextInt();
        obj.close();
        if(age>=18 && id==1){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Denied");
        }
    }
}
