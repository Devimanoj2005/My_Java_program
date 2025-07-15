package module1;
import java.util.Scanner;
public class MonthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        System.out.println("Enter the month:");
        String monthName = sc.next();

        int numberOfDays = 0;

        switch(monthName.toLowerCase()) {
            case "january": case "march": case "may": case "july":
            case "august": case "october": case "december":
                numberOfDays = 31;
                break;

            case "april": case "june": case "september": case "november":
                numberOfDays = 30;
                break;

            case "february":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;

            default:
                System.out.println("Invalid month.");
                sc.close();
                return; 
        }

        System.out.println("The number of days in " + monthName + " " + year + " is " + numberOfDays);
    
    }
}
