public class SubArray {

    public static void printsubArray(int arr[]) {
        int tsb = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {

                    System.out.print(arr[k]);
                }
                tsb++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total sub array is:" + tsb);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printsubArray(arr);
    }

}
