import java.util.Scanner;

public class DataCompressionSizeReduction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fSize = obj.nextInt();
        int compSize = obj.nextInt();
        obj.close();
        System.out.println(fSize>>compSize);
    }
}
