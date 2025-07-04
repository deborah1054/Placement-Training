import java.util.*;

public class Maxzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of the matrix (n x n)
        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxZeros = 0;
        int rowIndex = -1;

        // Find row with max zeros
        for (int i = 0; i < n; i++) {
            int zeroCount = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
            if (zeroCount > maxZeros) {
                maxZeros = zeroCount;
                rowIndex = i;
            }
        }

        // Output result
        if (maxZeros == 0) {
            System.out.println("No row has zeros");
        } else {
            System.out.println(rowIndex);
        }
    }
}
