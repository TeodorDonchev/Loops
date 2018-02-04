package mentoring_meeting;

import java.util.Scanner;

/**
 * Created by teodor donchev on 2/4/2018.
 */
public class SmartLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        int priceForOneToy = Integer.parseInt(scan.nextLine());

        int moneyForBirthday = 10;
        int collectedMoney = 0;
        int toyCount = 0;

        for (int i = 1; i <= age ; i++) {
            if(i % 2 == 0){
                collectedMoney += moneyForBirthday - 1;
                moneyForBirthday += 10;
            }else{
                toyCount++;
//                toyCount += 1;
//                toyCount = toyCount + 1;
            }
        }

        collectedMoney += toyCount * priceForOneToy;

        if(collectedMoney >= washingMachinePrice){
            System.out.printf("Yes! %.2f", collectedMoney - washingMachinePrice);
        }else{
            System.out.printf("No! %.2f", washingMachinePrice - collectedMoney);
        }
    }
}
