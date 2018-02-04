import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            leftSum += currentNumber;
        }

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            rightSum += currentNumber;
        }

        if(leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
