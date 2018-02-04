package mentoring_meeting;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by teodor donchev on 1/5/2018.
 */
public class Salary {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        double salary = Double.parseDouble(scan.nextLine());
        int years = Integer.parseInt(scan.nextLine());
        String syndicate = scan.nextLine();

        int currentYear = 0;
        double currentSalary = salary;

        if(salary >= 5000){
            System.out.println("Current salary: 5000.00");
            System.out.println("0 more years to max salary.");
            return;
        }
        while(currentSalary <= 5000){

            currentYear++;

            currentSalary += currentSalary * 0.06;

            if(currentYear % 10 == 0){
                currentSalary += 200;
            }
            else if(currentYear % 5 == 0){
                currentSalary += 100;
            }

            else if(syndicate.equalsIgnoreCase("yes")) {
                currentSalary -= currentSalary * 0.001;
            }

            if(currentSalary >= 5000 && currentYear <= years){
                salary = 5000;
                currentYear = years + 1;
                break;
            }

            if(currentYear == years){
                salary = currentSalary;
            }
        }



        System.out.printf("Current salary: %.2f\n", salary);
        System.out.printf("%d more years to max salary.", (currentYear - years) - 1);
    }
}

