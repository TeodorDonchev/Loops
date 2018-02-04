import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if(currentNumber < minNumber){
                minNumber = currentNumber;
            }
        }

        System.out.println(minNumber);
    }
}
