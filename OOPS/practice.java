public class practice{
   public static void main(String[] args) {

    person p1 = new person();//person class ka object hai p1, we can create multiple objects 
    p1.age = 21;
    p1.name = "Bipul";

    person p2 = new person();
    p2.name= "HO HO";
    p2.age = 60;

   System.out.println(p1.age + " " + p1.name);
   System.out.println(p2.age + " " + p2.name);

   p1.marry();
   p2.walk();

   }
   
}
class person {// dono persons is class k madad se bane hai
    String name;
    int age; 

    void walk (){// function/ method 
    System.out.println( name  + "is walking" );
    }

    void marry (){
        System.out.println( name  + "is elibile fro marriege when he is " + age);
        }
}