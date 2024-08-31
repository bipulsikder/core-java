public class q8 {
    public static void main(String[] args) {
    //  reverse number 

    //  int n = 1234;
    // // do {
    // //  int r = n%10;
    // //  System.out.print(r);
    // //  n = n/10;
    // // }while (n>0);
    // while(n>0){
    //     int r = n % 10;
    //     System.out.print(r); 
    //     n = n / 10 ;
    // }

    //reverse a string 
    String name = "Bipul";
    int length = name.length();//value of length is 5 (ye method kitne char hai ginta hai)
     String rev = " " ;
    for (int i = length -1; i >= 0 ; i--){
        rev = rev + name.charAt(i);// name.char at i = 5 pe "l" hai print l karwate hai toh ho jayenga
       
    }
    System.out.println(rev);
    }
}
