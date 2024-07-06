import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of rows and columns of the square matrix
        System.out.println("Enter the number of rows and columns for the square matrix:");
        int n = scanner.nextInt();

        // Input for the matrix
        System.out.println("Enter elements for the square matrix:");

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is symmetric
        boolean isSymmetric = isSymmetricMatrix(matrix, n);

        // Display the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        scanner.close();
    }

    // Method to check if a matrix is symmetric
    public static boolean isSymmetricMatrix(int[][] matrix, int n) {
        // Check if the matrix is square
        if (matrix.length != n || matrix[0].length != n) {
            return false;
        }

        // Check for symmetry
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}