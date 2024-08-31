public class q12 {
    public static void main(String[] args) {
        String name = "behen ke lawde";
        int x = name.length();
        String  rev = " ";
        for(int i = x-1 ; i >= 0 ; i--){
        rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
