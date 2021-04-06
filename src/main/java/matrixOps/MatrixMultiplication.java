package matrixOps;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        multiplyMatrices();
    }

    public static void multiplyMatrices() {
        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];
        matrix1 = acceptMatrixAsInputFromStandardInput();
        matrix2 = acceptMatrixAsInputFromStandardInput();
        // what do I do with this? how many times do I call this?
        performMultiplication(matrix1, matrix2);

    }

    /**
     * A method to read a matrix of specific dimensions
     * from standard input
     *
     * @return a multidimensional array containing the matrix
     */
    public static int[][] acceptMatrixAsInputFromStandardInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int nRows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int nCols = scanner.nextInt();
        // what happens here?

        int[][] matrix = new int[10][10];
        for (int row = 0; row < nRows; row++) {
            for (int col = 0; col < nCols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
            // and here?
        }
        return matrix;
    }

    /**
     * A method to perform the actual matrix multiplication
     */
    public static void performMultiplication(int[][] matrix1, int[][] matrix2) {
        // should this function accept parameters?
        for (int i = 0; i < 3; i++) {
            int[][] product = new int[10][10];

            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {

                    product[i][j] = product[i][j] + matrix1[i][k] * matrix2[k][j];
                }
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(product[i][j]+"");
                    }
                    System.out.println("");
                }
            }

        }
    }
}