import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class DivisionWithoutDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if(currentNumber % 2 == 0){
                p1++;
            }
            if(currentNumber % 3 == 0){
                p2++;
            }
            if(currentNumber % 4 == 0){
                p3++;
            }
        }

        System.out.printf("%.2f%%\n", (p1 / n) * 100);
        System.out.printf("%.2f%%\n", (p2 / n) * 100);
        System.out.printf("%.2f%%\n", (p3 / n) * 100);
    }
}
