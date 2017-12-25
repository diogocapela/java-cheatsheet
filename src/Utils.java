public class Utils {

    public void printVectorString(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(i + ": " + vector[i]);
            System.out.println();
        }
    }

    public void printVectorInt(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(i + ": " + vector[i]);
            System.out.println();
        }
    }

    public void printVectorDouble(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(i + ": " + vector[i]);
            System.out.println();
        }
    }

    public void printMatrixString(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrixInt(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrixDouble(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

}