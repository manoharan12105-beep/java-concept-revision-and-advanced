import java.util.*;
public class Main{
     public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
        
        System.out.print("Sorted Array : ");
        for(int i = 0; i < n; i++)  System.out.print(arr[i] + " ");
    }
    
	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter Array size : ");
	    int size = scanner.nextInt();
	    
	    int[] arr = new int[size];
	    System.out.print("Enter Array Elements : ");
	    
	    for(int i = 0; i < size; arr[i++] = scanner.nextInt());
	    insertionSort(arr);
	}
}

/*
Output 
  Enter Array size : 5
  Enter Array Elements : 86 15 67 98 15 32
  Sorted Array : 15 32 67 85 98

Time : O(n ^ 2)
*/
