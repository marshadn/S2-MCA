import java.util.Scanner;

public class SymmetricMatrixCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();
        boolean isSymmetric = true;
        if (rows != cols) {
            isSymmetric = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
                if (!isSymmetric) {
                    break;
                }
            }
        }
        if (isSymmetric) {

            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        scanner.close();
    }
}

