import java.util.Scanner;

public class BookPublishingCoatCalculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int cop = obj.nextInt();
        int cost = obj.nextInt();
        int edit = obj.nextInt();
        int des = obj.nextInt();
        int comm = obj.nextInt();
        int market = obj.nextInt();
        obj.close();
        int val = (cop * cost)+ edit+ des-comm- market;
        System.out.println("Publishing cost: "+val);
    }
}
