import java.util.Scanner;

/**
 * Created by teodor donchev on 2/3/2018.
 */
public class SmartLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washingMachineCost = Double.parseDouble(scan.nextLine());
        int costForOneToy = Integer.parseInt(scan.nextLine());

        int moneyForEvenBirthday = 10;
        int toyCount = 0;
        int collectedMoney = 0;

        for (int i = 1; i <= age; i++) {
            if(i % 2 == 0){
                collectedMoney += moneyForEvenBirthday - 1;
                moneyForEvenBirthday += 10;
            }else{
                toyCount++;
            }
        }

        collectedMoney += toyCount * costForOneToy;

        if(collectedMoney >= washingMachineCost){
            System.out.printf("Yes! %.2f", collectedMoney - washingMachineCost);
        }else{
            System.out.printf("No! %.2f", washingMachineCost - collectedMoney);
        }
    }
}
