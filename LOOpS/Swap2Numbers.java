// Swap 2 numbers 

// import java.util.Scanner;
public class Swap2Numbers{
    public static void main (String args[]){

    // Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = 10;
    int b = 20;

    // method 1 Two extra variable 
    // int c = b;
    // int d = a;

    // System.out.print(c);
    // System.out.println(d);
    
    //method 2 - third variable 
//     int z = a;
//     a = b ;
//     b = z;
// System.out.println(a + " " + b);

    //method 3 : use + & - (Withourt using third variable)
    /*a = a + b;
    b = a - b;
    a = a - b ;
    System.out.println(a + " " + b);*/

//Logic 4- use * and / without using third variable /here a & b values should not be Zero
    /*a = a * b;  //200
    b = a / b; //10
    a = a / b;  //20
    System.out.println(a + " " + b);*/

    //Logic 5- bitwise XOR (^) 
    /*a=a^b; //10^20 = 30
    b=a^b; // 30^20 = 10
    a=a^b; //30^100 = 20

    System.out.println(a + " " + b);*/

//Logic 6 - Single statement
//a=10 b=20
b=a+b-(a=b);

System.out.println(a + " " + b);



    }
}