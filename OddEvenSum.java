import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if(i % 2 == 0){
                evenSum += currentNumber;
            }else{
                oddSum += currentNumber;
            }
        }

        if(evenSum == oddSum){
            System.out.printf("Yes, sum = %d", evenSum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
