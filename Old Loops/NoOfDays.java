import java.util.Scanner;

public class NoOfDays{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     sc.close();
     if((x*100)>1000) {
        System.out.println("Eligilble for discount" + (.1*x*100) + "total" + (x*100-(.1*x*100))) ;
     }else{
      System.out.println("not eligible");
     }


   }
}