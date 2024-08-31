package LOOpS;
// Create a program to print the Fibonacci sequence up to the 10th term using a `for` loop.
// 1 1 2 3 5 8 13 21 

public class q4 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0 ;
        int b = 1;
        // int c ;
        for (int i = 2 ; i < n ;i++ ){
           int c = a + b ;
           System.out.print(c + " ");
           a = b;
           b = c;
            
           
        }
    }
}
