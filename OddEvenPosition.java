import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class OddEvenPosition {
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

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.printf("OddSum=%s,\n", df.format(oddSum));
        System.out.printf(oddMin == Integer.MAX_VALUE ? "OddMin=No,\n" : "OddMin=%s,\n", df.format(oddMin));
        System.out.printf(oddMax == Integer.MIN_VALUE ? "OddMax=No,\n" : "OddMax=%s,\n", df.format(oddMax));

        System.out.printf("EvenSum=%s,\n", df.format(evenSum));
        System.out.printf(evenMin == Integer.MAX_VALUE ? "EvenMin=No,\n" : "EvenMin=%s,\n", df.format(evenMin));
        System.out.printf(evenMax == Integer.MIN_VALUE ? "EvenMax=No\n" : "EvenMax=%s\n", df.format(evenMax));
    }
}
