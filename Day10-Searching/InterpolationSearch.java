public class Main {
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {

            if (low == high)
                return arr[low] == key ? low : -1;

            int pos = low + ((key - arr[low]) * (high - low)) 
                    / (arr[high] - arr[low]);

            if (arr[pos] == key)
                return pos;
            else if (arr[pos] < key)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int key = 70;

        int result = interpolationSearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}

/*

Output : Element found at index 6

Time Complexity :
  Best: O(1)
  Average: O(log log n)
  Worst: O(n)

Sorted Array : Needed

*/
