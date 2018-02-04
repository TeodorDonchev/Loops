import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int currentSum = 0;
        int previousSum = 0;

        int difference = 0;
        int biggestDifference = 0;

        for (int i = 0; i < n; i++) {
            int firstNumber = Integer.parseInt(scan.nextLine());
            int secondNumber = Integer.parseInt(scan.nextLine());

            if(i == 0){
                previousSum = firstNumber + secondNumber;
            }

            currentSum = firstNumber + secondNumber;

            difference = Math.abs(currentSum - previousSum);
            if(difference > biggestDifference){
                biggestDifference = difference;
            }

            previousSum = currentSum;
        }

        if(biggestDifference == 0){
            System.out.printf("Yes, value=%d", previousSum);
        }else{
            System.out.printf("No, maxdiff=%d", biggestDifference);
        }
    }
}
