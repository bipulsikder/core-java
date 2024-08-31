package LOOpS;
// 5. Write a loop to print the multiplication table for the number 5.
public class multiplicationTable {
    public static void main(String[] args) {
        int n = 50;
        
        for (int i = 1 ; i <= 10 ; i++){
            int sum = n * i  ;
            System.out.println( n + " * "+ i + " = " + sum);

        }
    }
}
