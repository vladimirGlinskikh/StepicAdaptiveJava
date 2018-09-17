package adaptiveJava.rotateRectangle;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        int[][] matrix = {
                {3, 4, 0, 0},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };

        printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrixBy90DegreeClockwise(matrix);
        System.out.println("\n");
        printMatrix(rotatedMatrix);
    }

    private int[][] rotateMatrixBy90DegreeClockwise(int[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
        int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix
        int lastColsOfMatrix = matrix.length - 1;

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][(totalColsOfRotatedMatrix - 1) - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }


    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}