package matrixOps;

import java.util.Scanner;

public class MatrixAddition {
    public void addMatrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int nRows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int nCols = scanner.nextInt();

        acceptMatrixAsInputFromStandardInput(nRows, nCols); // I want to add 3 matrices. how many times do I call this?
        performAddition(); // why does this throw an error?
        // if I don't want to change the function definition/parameter list, how can I add 3 matrices?
        // start with 2. we can work on 3 together also
        prettyPrintMatrix(); // why does this throw an error?

    }

    /**
     * A method to read a matrix of specific dimensions
     * from standard input
     * @return a multidimensional array containing the matrix
     */
    private int[][] acceptMatrixAsInputFromStandardInput(int nRows, int nCols) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for matrix: ");

        int[][] matrix = new int[nRows][nCols]; // what am I doing differently here? how is it helpful?
        for (int row = 0; row < nRows; row++) {
            // fill here
        }

        return matrix;
    }

    /**
     * A method to perform the actual matrix multiplication
     * @return the sum of two matrices
     */
    private int[][] performAddition(int nRows, int nCols, int[][] matrixA, int[][] matrixB) {
        // should this function accept parameters?
        int[][] summationMatrix = new int[5][5]; // what would be a better way to do this declaration? look at the parameters passed to this function
        return summationMatrix;
    }

    /**
     * A method to print a matrix, properly formatted
     */
    private void prettyPrintMatrix(int[][] matrixA) {

    }
}
