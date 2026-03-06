import java.util.Scanner;

public class YoutubeChannelMonthlyIncome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ads = obj.nextInt();
        int sponsor = obj.nextInt();
        int affiliate = obj.nextInt();
        int tax = obj.nextInt();
        int prod = obj.nextInt();
        obj.close();
        int value = ads+ sponsor+ affiliate- tax- prod;
        System.out.println("Final Revenue: "+value);

    }
}
