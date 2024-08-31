// B.print prime number bw 1 to 10
import java.util.Scanner;
public class Q6bPrintPrime{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter initaial number ");
    int  n1 = sc.nextInt();
        System.out.println("Enter the number from where you want prime printed");
    int  n2 = sc.nextInt();
    
        for (int i = n1 ; i <= n2; i++){
            int counter = 0;
            for(int j = 1 ; j<=i ; j++){
                if (i%j==0){
                    counter = counter + 1;
                }
            }if(counter==2){
                System.out.println(i+ " ");
            }
        }
        sc.close();

    }
}
