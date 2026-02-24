import java.util.*;
public class Main
{
     public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        System.out.print("Sorted Array : ");
        for(int i = 0; i < n; i++)  System.out.print(arr[i] + " ");
    }
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter Array size : ");
	    int size = scanner.nextInt();
    
	    int[] arr = new int[size];
	    System.out.print("Enter Array Elements : ");
    
	    for(int i = 0; i < size; arr[i++] = scanner.nextInt());
	    selectionSort(arr);
	}
}

/*

Output

  Enter Array size : 5
  Enter Array Elements : 90 70 30 20 10
  Sorted Array : 10 20 30 70 90 

Time : O(n ^ 2)

*/
