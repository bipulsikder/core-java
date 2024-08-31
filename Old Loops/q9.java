// check prime or not 
// print prime from 1 to 100

// 7 = divisible only by 1 & 7 remaing 2,3,4,5,6 matlab (2 se lekar 7-1 tak ) reminder 0 ata hai toh not prime ; else prime ho jyga
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int c = 0;
    //    for (int i = 1;i<=n;i++){
    //       for(int j = 2;j<=i;j++){
    //         c= c+1;
    //       }
    //       if(c==0){
    //       System.out.println(i);
    //       }else{
          
    //       }
    //    }
    sc.close();
    // }
// }
// for loop 
    for (int i = 2; i<=n-1;i++){
                c=c+1;
        
    }
    if (c>2){
        System.out.println(n+ " is not prime");
    }
    else{
        System.out.println(n + " is prime number");
    }
// while loop
  }
}