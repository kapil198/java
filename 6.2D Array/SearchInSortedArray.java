public class SearchInSortedArray {
    public static boolean searchInSortedArray(int matrix[][], int k) {
        int rows = 0;
        int cols = matrix[0].length - 1;
        while (rows < matrix.length && cols >= 0) {
            if (matrix[rows][cols] == k) {
                System.out.println("Found key at (" + rows + "," + cols + ")");
                return true;
            } else if (k < matrix[rows][cols]) {
                cols--;
            } else {
                rows++;
            }
        }

        System.out.println("Not Found");
        return false;
    }

    public static void main(String args[]) {
        int k = 33;
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        searchInSortedArray(matrix, k);
    }
}
