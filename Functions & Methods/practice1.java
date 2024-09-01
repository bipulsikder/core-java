public class practice1 {

    public static void main(String[] args) {
    //   hoho();
    //   hoho1();
    //   hello(2,5);
    //   hello(7, 8);

    int lala = hello(5, 5);//hello(5, 5); isse tum kuch bhi kar sakte ho 
         System.out.println(lala);
    int gand= lala+ 2;
        System.out.println(gand);
    }


    // public static void hoho(){
    //     System.out.println("ka be");
    // }
    // public static void hoho1(){
    //     System.out.println("thik cho");
    // }

    // public static void hello(int a,int b, String c)//the parameters should be same 
    // {
    //     System.out.println(a+b);
        
    // }

    public static int hello(int a,int b)// samjho ki jo return ka matlab hota hai,wo value ko is class se dusre class me presence darsata hai, hum print na karwake dusre class me apne hisab se kuch bbhi kar sakte hai 
    { 
        int haha= a + b;
        return haha; // we camn return only one value 
        
    }


}