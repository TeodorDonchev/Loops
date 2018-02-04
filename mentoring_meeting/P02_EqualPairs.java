package mentoring_meeting;

import java.util.Scanner;

/**
 * Created by teodor donchev on 2/4/2018.
 */
public class P02_EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int previousSum = 0;
        int currentSum = 0;

        int difference = 0;
        int biggestDiff = 0;


        for (int i = 0; i < n; i++) {
            int firstNumber = Integer.parseInt(scan.nextLine());
            int secondNumber = Integer.parseInt(scan.nextLine());

            if(i == 0){
                previousSum = firstNumber + secondNumber;
            }else{
                currentSum = firstNumber + secondNumber;

                difference = Math.abs(previousSum - currentSum);

                if(difference > biggestDiff){
                    biggestDiff = difference;
                }

                previousSum = currentSum;
            }
        }

        if(biggestDiff == 0){
            System.out.printf("Yes, value=%d", currentSum);
        }else{
            System.out.printf("No, maxdiff=%d", biggestDiff);
        }
    }
}
