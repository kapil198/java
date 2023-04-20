public class LargestNum {

    public static int getLargestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
                System.out.println("the min element in the array is:" + min);
            }

        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 6, 3, 5 };

        System.out.println("the largest element of the array is :" + getLargestNumber(arr));
    }

}
