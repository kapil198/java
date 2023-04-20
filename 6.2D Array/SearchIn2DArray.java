import java.util.*;

public class SearchIn2DArray {

    public static boolean search(int matrix[][], int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == k) {
                    return true;

                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No: of Rows in array :");
        int n = sc.nextInt();
        System.out.print("Enter the NO: of colms in the array: ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(search(matrix, 7));
        // out put of the array is
        System.out.println("Given array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
