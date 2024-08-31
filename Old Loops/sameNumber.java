import java.util.Scanner;

public class sameNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (a==b){
           System.out.println("same");
        }else{
            System.out.println("different");
        }
        sc.close();
    }

}