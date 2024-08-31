import java.util.Scanner;

public class DayUsingNo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter interger between 1 - 7");
        int n = sc.nextInt();
        System.out.println(hellow(n));
        sc.close(); 
    }
    
       public static String hellow(int n) {
        String dayname = " ";
        switch (n) {
            case 1:dayname= "monday";break;
            case 2:dayname= "Tuesday";break;
            case 3:dayname= "Wendsday";break;
            case 4:dayname= "Thrusday";break;
            case 5:dayname= "Friday";break;
            case 6:dayname= "Saturday";break;
            case 7:dayname= "sunday";break;
            default:dayname= "invalid day range";break;
                
        }
        return dayname  ;
       }
    }

 
