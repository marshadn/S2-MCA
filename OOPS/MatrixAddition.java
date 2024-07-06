// import java.util.Scanner;

// public class MatrixAddition {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number of rows for the matrices:");
//         int rows = scanner.nextInt();
//         System.out.println("Enter the number of columns for the matrices:");
//         int columns = scanner.nextInt();

//         int[][] matrix1 = new int[rows][columns];
//         int[][] matrix2 = new int[rows][columns];

//         System.out.println("Enter elements for the first matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 matrix1[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Enter elements for the second matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 matrix2[i][j] = scanner.nextInt();
//             }
//         }

//         int[][] resultMatrix = new int[rows][columns];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }

//         System.out.println("Resultant Matrix (Sum of the two matrices):");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print(resultMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no.of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the no.of coloumns");
        int coloumns = scanner.nextInt();

        int[][] matrix1 = new int[rows][coloumns];
        int[][] matrix2 = new int[rows][coloumns];

        System.out.println("Enter the elemnts of matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elemnts of matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatrix = new int[rows][coloumns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                resultMatrix[i][j] = matrix1[i][i] + matrix2[i][j];
            }
        }
        System.out.println("Resultant Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}