public class q10 {
    public static void main(String[] args) {
        int number = 1;

        System.out.println("Even numbers between 1 and 20:");

        while (number <= 20) {
            // Check if the current number is even
            if (number % 2 == 0) {
                System.out.print("  " + number);
            }

            // Move to the next number
            number++;
        }
    }
}
