public class Q7RevOfString {
    public static void main(String[] args) {
        String name = "ABCD";
        String rev= "";
        int len = name.length();
        int i = len - 1;
        // for loop
    // for(int i = len-1 ; i>=0 ; i--){
    //   rev = rev + name.charAt(i);
    // }
    // System.out.println(rev);

    // while
    //  while(i>=0){
    //  rev = rev + name.charAt(i);
    //  i--;
    //  }
    //  System.out.println(rev);
    // }

    // do while
    do{
        rev = rev + name.charAt(i);
        i--;
    }   while(i>=0);
System.out.println(rev);
    }
}