public class Main {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearchRecursive(arr, low, mid - 1, key);
        else
            return binarySearchRecursive(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int key = 23;

        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.println("Iterative: Element found at index " + result);
        else
            System.out.println("Iterative: Element not found");

        int resultRecursive = binarySearchRecursive(arr, 0, arr.length - 1, key);

        if (resultRecursive != -1)
            System.out.println("Recursive: Element found at index " + resultRecursive);
        else
            System.out.println("Recursive: Element not found");
    }
}

/*

Output

Iterative: Element found at index 5
Recursive: Element found at index 5

Time : O(log N)
Sorted Array : Must Need

*/
