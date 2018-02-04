package mentoring_meeting;

import java.util.Scanner;

/**
 * Created by teodor donchev on 2/4/2018.
 */
public class Rate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double investingMoney = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());

        double simpleRate = investingMoney;
        double complexRate = investingMoney;

        simpleRate = (investingMoney * 0.03) * months + investingMoney;

        for (int i = 0; i < months; i++) {
            complexRate = complexRate + (complexRate * 0.027);
        }

        System.out.printf("Simple interest rate: %.2f lv.\n", simpleRate);
        System.out.printf("Complex interest rate: %.2f lv.\n", complexRate);

        if(simpleRate > complexRate){
            System.out.printf("Choose a simple interest rate. You will win %.2f lv.",
                    simpleRate - complexRate);
        }else{
            System.out.printf("Choose a complex interest rate. You will win %.2f lv.",
                    complexRate - simpleRate);
        }
    }
}
