public class Q6cSumOfPrime {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 10;
        int sum = 0;
        for(int i = n1; i <= n2; i++) {
            int counter = 0;
            for(int j = 1; j <= i; j++) { // Fixed the incrementing variable to j
                if(i % j == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                sum = sum + i;
            }
        }
        System.out.println(sum); // Moved print statement outside of the loop
    }
}
