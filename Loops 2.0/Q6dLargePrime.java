// Find the largest prime factor of a given number.
import java.util.Scanner;
public class Q6dLargePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 1 ;i<=n;i++){
            if(n%i==0){
              counter = counter + 1;
            }
        }if(counter==2){
           System.out.println(n);
        }
        sc.close();
    }
}
