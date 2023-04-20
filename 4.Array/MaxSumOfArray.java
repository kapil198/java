public class MaxSumOfArray {
    public static void printMaxSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // Sub ArraySum

                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
            System.out.println();
        }
        System.out.println("maxsum of the array is :" + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { -1, -4, 5, 8, 9, 1 };
        printMaxSum(arr);
    }

}
