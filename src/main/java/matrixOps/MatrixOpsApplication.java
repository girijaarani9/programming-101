package matrixOps;

public class MatrixOpsApplication {
    public static void main(String[] args) {
        // declaring main, a static function, separately
        // helps avoid declaring every function as static
        // we will look at how later, for now let's use this main function
        MatrixAddition matrixAddition = new MatrixAddition();
        matrixAddition.addMatrices();
    }
}
