public class PairsInAnArray {
    public static void pairinArray(int arr[]) {// the complexity of the code is O(n2)
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                tp++;
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
            }
            System.out.println();
        }
        System.out.println("total pair in the array is:" + tp);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairinArray(arr);

    }
}
