// 6.Check if a given number is prime using a `for` loop.

import java.util.Scanner;

public class Q6PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        sc.close();

    // for(int i = 2;i<=n-1;i++){
    //         if(n%i==0){
    //         counter = counter + 1;
    //         }
    //     }
    // if (counter == 0){
    //            System.out.println(n + " is a Prime number ");
    //      }else{
    //            System.out.println(n + "is not a prime number");
    //         }


    for(int i = 1 ;i <= n ;i++){
         if (n%i == 0){
            counter = counter + 1;
         }
    }
    if (counter == 2){
    System.out.println(n + " is a Prime number ");
    }else{
        System.out.println(n + "is not a prime number");
    }
    }
}
