public class BinarySearch {

    public static int binarySearch(int arr[], int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // compare the mid value;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 6, 8, 10, 12, 14, 16 };
        int k = 10;
        System.out.println("the index of the element is:" + binarySearch(arr, k));
    }

}
