// Print the even numbers between 20 and 30 using a `do-while` loop.
public class Q3Even20To30 {
    public static void main(String[] args) {

    int i = 20;
    // int n = 0;
    do{
       if (i % 2 == 0){
        System.out.print(i);
       }else {
        System.out.print(" ");
       }
       i = i + 1 ;
    }while(i<=30);

}

}