package mentoring_meeting;

import java.util.Scanner;

/**
 * Created by teodor donchev on 2/4/2018.
 */
public class FootbalLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        int fanCount = Integer.parseInt(scan.nextLine());

        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;

        for (int i = 0; i < fanCount; i++) {
            String sector = scan.nextLine();

            switch (sector){
                case "A": sectorA++;
                    break;
                case "B": sectorB++;
                    break;
                case "V": sectorV++;
                    break;
                case "G": sectorG++;
                    break;
            }

        }

        System.out.printf("%.2f%%\n", (sectorA / fanCount) * 100);
        System.out.printf("%.2f%%\n", (sectorB / fanCount) * 100);
        System.out.printf("%.2f%%\n", (sectorV / fanCount) * 100);
        System.out.printf("%.2f%%\n", (sectorG / fanCount) * 100);
        System.out.printf("%.2f%%\n", (fanCount * 1.0 / capacity) * 100);
    }
}
