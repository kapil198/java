import java.util.*;

public class InbuildSorting {
    public static void main(String args[]) {
        Integer arr[] = { 4, 5, 3, 1, 2 };
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
