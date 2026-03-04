
import java.util.*;
public class StudentScholarshipEligibilityAmount {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int tutfees = obj.nextInt();
    int scf = obj.nextInt();
    int examfee = obj.nextInt();
    int libfee = obj.nextInt();
    obj.close();
    float bill = tutfees - tutfees*(scf/100.0f);
    float totbill = bill+examfee+libfee;
    System.out.println("Final payable Fee:"+totbill );


}    
}
