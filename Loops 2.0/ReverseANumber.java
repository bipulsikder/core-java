import java.util.Scanner;
public class ReverseANumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        //1. using algorithm
        //1234
        // int rev=0;
        // while(num!=0){
        // rev=rev*10 + num%10; //0+1234%10=4 40+3=43 430÷2=432 4320+1=4321
        // num=num /10;  //1234/10=123 123/10=12 12/10=1 1/10=0
        

          //2. using stringBuffer class
         // StringBuffer sb=new StringBuffer(String.valueOf(num));
        // StringBuffer rev=sb. reverse();
       // System.out.println("Reverse Number is:"+ rev);
        

        //3. Using Stringbuilder class
        StringBuilder bip = new StringBuilder();
        bip.append(num);
        StringBuilder rev = bip.reverse();

        System.out.println(rev);
    sc.close();}
        
}
