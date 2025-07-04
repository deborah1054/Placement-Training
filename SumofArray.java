import java.util.*;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        // Read matrix and calculate sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of All Elements of the Matrix is " + sum);
    }
}
