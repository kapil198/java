import java.util.*;

public class LinearSearchx {
    public static int linearSearch(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 8, 9, 10, 14, 15, 17, 20 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = linearSearch(arr, k);
        if (a == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("index of the number is:" + a);
        }
    }
}