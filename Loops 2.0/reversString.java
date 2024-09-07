public class reversString {
    public static void main(String[] args) {
        //using (String concatation ) operation operator
    String bp = "ABCD";
    String rev = "";
    int len = bp.length();
    for (int i = len-1 ; i >=0 ; i--)
     {
        rev = rev + bp.charAt(i);
     }

System.out.println(rev);

    }
}
