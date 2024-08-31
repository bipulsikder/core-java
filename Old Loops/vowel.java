import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month number
        System.out.print("Enter the month number (1-12): ");
        int n = scanner.nextInt();

        // Using switch to determine the month name
        String monthName;
        switch (n) {
            case 1:
                monthName = "January";break;
            case 2:
                monthName = "February"; break;
            case 3:
                monthName = "March";break;
            case 4:
                monthName = "April";break;
            case 5:
                monthName = "May";break;
            case 6:
                monthName = "June";break; 
            case 7:
                monthName = "July";break;
            case 8:
                monthName = "August";break;
            case 9:
                monthName = "September";break;
            case 10:
                monthName = "October";break;
            case 11:
                monthName = "November";break;
            case 12:
                monthName = "December";break;
            default:
                monthName = "Invalid month number";
        }

        // Output the result
        System.out.println("Month: " + monthName);

        scanner.close();
    }
}
