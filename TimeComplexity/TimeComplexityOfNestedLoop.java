package TimeComplexity;

import java.util.Scanner;

public class TimeComplexityOfNestedLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j); // O(n)^2
            }
        }
    }

    public static void MN() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }
        }
    }
}

