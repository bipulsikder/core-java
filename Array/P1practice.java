/**
 * practice
 */
import java.util.Arrays;
import java.util.Scanner;
public class P1practice {

    public static void main(String[] args) {
        Scanner bp = new Scanner(System.in);

        // ARRAY OF PRIMITIVES


        // int ok = bp.nextInt();

        // int[] p1 = new int[ok];
        // for(int i = 0; i <= p1.length ; i++){
        //     System.out.print(p1[i]);
        // }

        // int[] p2 = new int[5];
        // p2[0] = 23;
        // p2[1] = 53 ;
        // p2[2] = 66 ;
        // p2[3] = 776 ;
        // p2[4] = 9;
        
        // System.out.println(p2[0]);

    // input using for loops

    // for (int i = 0; i < p2.length; i++) {
    //     p2[i] = bp.nextInt();
    // }

    // System.out.println(Arrays.toString(p2));

    // for (int i = 0; i < p2.length; i++) {
    //     System.out.print(p2[i]);
    // }

    // for (int iterable_element : p2) {//for every leemnet in array , print the element 
    //     System.out.println(iterable_element);//here terable_element represents element of the array 
    // }



    //  ARRAY OF OBJECTS

    String[] obj = new String[5];// for loop to take inputs from the user 
       for (int i = 0; i < obj.length; i++) {
        obj[i]=bp.next();
       }

       System.out.println(Arrays.toString(obj));

       obj[4] = "Bipul";

       System.out.println(Arrays.toString(obj));
       bp.close();
    }
}
