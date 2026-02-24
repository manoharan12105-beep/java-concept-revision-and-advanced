import java.util.*;
public class Main {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; arr[i++] = scanner.nextInt());

        quickSort(arr, 0, size - 1);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}

/*
Output
  Enter Array size : 5
  Enter Array Elements : 15 25 10 35 5
  Sorted Array : 5 10 15 25 35 

  Time : O(n log n)
*/
