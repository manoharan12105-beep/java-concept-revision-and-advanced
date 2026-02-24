import java.util.*;
public class Main
{
     public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
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
	    bubbleSort(arr);
	}
}

/*
Output

Enter Array size : 5
Enter Array Elements : 90 30 20 50 10
Sorted Array : 10 20 30 50 90 

Time : O(n ^ 2)

*/
