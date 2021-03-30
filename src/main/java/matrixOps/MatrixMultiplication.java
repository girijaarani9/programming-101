package matrixOps;

import java.util.Scanner;

public class MatrixMultiplication {

    public void multiplyMatrices() {
        acceptMatrixAsInputFromStandardInput(); // what do I do with this? how many times do I call this?
        performMultiplication();
    }

    /**
     * A method to read a matrix of specific dimensions
     * from standard input
     * @return a multidimensional array containing the matrix
     */
    public int[][] acceptMatrixAsInputFromStandardInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int nRows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        // what happens here?

        int[][] matrix = new int[10][10];
        for (int row = 0; row < nRows; row++) {
            // and here?
        }
        return matrix;
    }

    /**
     * A method to perform the actual matrix multiplication
     */
    public void performMultiplication() {
        // should this function accept parameters?
    }
}
