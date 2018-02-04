import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if(currentNumber > maxNumber){
                maxNumber = currentNumber;
            }

            sum += currentNumber;
        }

        sum -= maxNumber;

        if(sum == maxNumber){
            System.out.printf("Yes, sum = %d", sum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(sum - maxNumber));
        }
    }
}
