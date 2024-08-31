import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        // (fibonacci) 0 1 1 2 3 5 8 13 .....
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b = 1 ;
      
        
    while(a<=n){
        System.out.print(a+" ");
        int c=a+b;
        a=b;
        b=c;
        
       
    }
    sc.close();
    }
}
