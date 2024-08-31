import java.util.Scanner;

public class max3numbers {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         if (a>b && a>c){
            System.out.println(a + "is greatest");
         }
         if (b>a && b>c){
            System.out.println(b + "is greatest");
         }
         if (c>a && c>b){
            System.out.println(c + "is greatest");
         }
         sc.close();
    }
}
