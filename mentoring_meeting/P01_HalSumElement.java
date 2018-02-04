package mentoring_meeting;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by teodor donchev on 2/4/2018.
 */
public class P01_HalSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double currentNumber = Double.parseDouble(scan.nextLine());

            if(i % 2 == 0){
                evenSum += currentNumber;

                if(currentNumber < evenMin){
                    evenMin = currentNumber;
                }
                if(currentNumber > evenMax){
                    evenMax = currentNumber;
                }
            }else{
                oddSum += currentNumber;

                if(currentNumber < oddMin){
                    oddMin = currentNumber;
                }
                if(currentNumber > oddMax){
                    oddMax = currentNumber;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("OddSum=%s,\n", df.format(oddSum));

        if(oddMin == Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }else{
            System.out.printf("OddMin=%s\n", df.format(oddMin));
        }

        if(oddMax == Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        }else{
            System.out.printf("OddMax=%s,\n", df.format(oddMax));
        }

        System.out.printf("EvenSum=%s,\n", df.format(evenSum));

        if(evenMin == Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }else{
            System.out.printf("EvenMin=%s,\n", df.format(evenMin));
        }

        if(evenMax == Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else{
            System.out.printf("EvenMax=%s", df.format(evenMax));
        }

    }
}
