import java.util.*;
public class Main{
    public static void mergeSort(int[] arr, int left, int right){
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; arr[i++] = scanner.nextInt());

        mergeSort(arr, 0, size - 1);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}

/*
Output
  Enter Array size : 5
  Enter Array Elements : 16 4 1 25 9
  Sorted Array : 1 4 9 16 25 

Time : O(n log n)
*/
