package TimeComplexity;
import java.util.Scanner;
public class BasicOfTimeComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // Let's take input as 5
        for (int i = 0; i < input; i++) {

            // Print Statement
            System.out.println(i);

            /* Number of Operation will be 5
                as the print statement will be
                executed for 5 times.
             */

        }
    }
}

/* The time complexity of the Program is going to be
        O(n) i.e. O(5) at worst case, where "O" represents Operation and "n" represents input size
    */