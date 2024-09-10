import java.util.Scanner;
public class P32DArray {
    public static void main(String[] args) {
      Scanner bp = new Scanner(System.in);
        // int[][] okpaji = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        // // for (int i = 0; i < okpaji.length; i++) {
        // //     System.out.println(okpaji);
        // // }
        // for (int i = 0; i < okpaji.length; i++) {
        //     okpaji[i] = bp.nextInt();
        // }
 


        // int[][] fine = new int[3][2];
        // System.out.println(fine.length);//no of rows 

        // //input
        // for (int i = 0; i < fine.length; i++) {
        //     for (int j = 0; j < fine[i].length; j++) {// every array in that row the length of that array / the coioumn should be upto size of the row 
        //         fine[i][j] = bp.nextInt();
        //     }
        // }


      //solve this 
             // 123
             // 456
             // 789

    //    int[][] pr = new int[3][3];

    //    //input
    //    for (int i = 0; i < 3; i++) {
    //       for (int j = 0; j < 3; j++) {
    //         pr[i][j] = bp.nextInt();
    //     }
    //    } 

    //    //output
    //    for (int i = 0; i < 3; i++) {
    //     for (int j = 0; j < 3; j++) {
    //       System.out.print(pr[i][j]+ " ");
    //   }
    //   System.out.println();
    //  }   
     



    //  //solve this 
    //          // 123
    //          // 45
    //          // 7890
    // int[][] next = new int[3][];
    // // input
    // for (int i = 0; i < next.length; i++) {
    //   for (int j = 0; j < next[i].length; j++) {
    //     next[i][j]=bp.nextInt();
    //   }
    // }

    // //output
    // for (int i = 0; i < next.length; i++) {
    //   for (int j = 0; j < next[i].length; j++) {
    //     System.out.print(next[i][j]);
    //   }
    //   System.out.println();
    // }

    int[][] next = new int[3][];
    next[0] = new int[3]; // For "123"
    next[1] = new int[2]; // For "45"
    next[2] = new int[4]; // For "7890"

    // Input
    for (int i = 0; i < next.length; i++) {
        for (int j = 0; j < next[i].length; j++) {
            next[i][j] = bp.nextInt();
        }
    }

    // Output
    for (int i = 0; i < next.length; i++) {
        for (int j = 0; j < next[i].length; j++) {
            System.out.print(next[i][j]);
        }
        System.out.println();
    }


   bp.close();
        
    }

}
