import java.util.Scanner;

public class SmartCityWaterSupply {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int resUsage = obj.nextInt(); 
        int resRate  = obj.nextInt(); 
        int comUsage = obj.nextInt(); 
        int comRate= obj.nextInt();
        int connection = obj.nextInt(); 
        int penalty = obj.nextInt();
        int maintenance  = obj.nextInt();
        int treatment = obj.nextInt();   
        obj.close();
        
        long val = (resUsage * resRate)+ (comUsage * comRate)+ connection + penalty - maintenance - treatment;
        System.out.println("Net Water revenue: "+val);
 
    }   
} 
