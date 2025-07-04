import java.util.*;

public class Array_identical{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a1 = new int[r1][c1];

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] a2 = new int[r2][c2];

        // Input matrix 1
        System.out.println("Enter Matrix 1:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                a1[row][col] = sc.nextInt();
            }
        }

        // Input matrix 2
        System.out.println("Enter Matrix 2:");
        for (int row = 0; row < r2; row++) {
            for (int col = 0; col < c2; col++) {
                a2[row][col] = sc.nextInt();
            }
        }

        // Print matrices for debugging
        System.out.println("Matrix 1:");
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                System.out.print(a1[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int row = 0; row < r2; row++) {
            for (int col = 0; col < c2; col++) {
                System.out.print(a2[row][col] + " ");
            }
            System.out.println();
        }

        // Check dimensions
        if (r1 != r2 || c1 != c2) {
            System.out.println("NON IDENTICAL");
            return;
        }

        // Compare elements
        boolean identical = true;
        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c1; col++) {
                if (a1[row][col] != a2[row][col]) {
                    identical = false;
                    System.out.println("Mismatch at [" + row + "][" + col + "]");
                    break;
                }
            }
            if (!identical) break;
        }

        if (identical)
            System.out.println("IDENTICAL");
        else
            System.out.println("NON IDENTICAL");
    }
}

