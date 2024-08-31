import java.util.*;

public class evenOrodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
      

        // if (n%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("ODD");
        // }
        
        Double X = b*b - 4.0*a*c ;

        
        if (X >0.0){
        double r1 = (-b + Math.pow(X, 0.5)) / (2.0 * a);
        double r2 = (-b - Math.pow(X, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        
        }else if(X == 0.0){
            System.out.println(-b/(2*a));

        }
        else{
            System.out.println("no real roots");
        }

        
        sc.close();


    }
}