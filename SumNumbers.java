import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            sum += currentNumber;
        }

        System.out.println(sum);
    }
}
