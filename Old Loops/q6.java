import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long x = 1;
        for(int i = 1; i<=n ; i ++ ){
            x =x*i;
        }
        System.out.println(x);
    sc.close();
    }
 
}
