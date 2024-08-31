
// 8. Write a program to find the factorial of a number using a `do-while` loop.
// 1 2 3 4 5
public class Q8factorial {
    public static void main(String[] args) {
        int n = 5;
        int x = 1 ;
        int i = 1;
        do{
        x = x * i;
        i++;
        }while(i<=n);
        System.out.println(x);
    }
}
