public class SpiralMatrix {

    public static void printSpiralMatrix(int matrix[][]) {
        int startRows = 0;
        int endRows = matrix.length - 1;
        int startCols = 0;
        int endCols = matrix[0].length - 1;

        while (startRows <= endRows && startCols <= endCols) {

            // right
            for (int i = startCols; i <= endCols; i++) {
                System.out.print(matrix[startCols][i] + " ");
            }

            // bottom
            for (int j = startRows + 1; j <= endRows; j++) {
                System.out.print(matrix[j][endCols] + " ");
            }

            // left

            for (int i = endCols - 1; i >= startCols; i--) {
                System.out.print(matrix[endRows][i] + " ");
            }

            // top

            for (int j = endRows - 1; j > startRows; j--) {
                System.out.print(matrix[j][startCols] + " ");
            }

            startCols++;
            startRows++;
            endCols--;
            endRows--;

        }
        System.out.println();

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiralMatrix(matrix);
    }
}