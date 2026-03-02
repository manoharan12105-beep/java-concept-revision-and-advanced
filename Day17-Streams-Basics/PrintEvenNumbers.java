import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 4, 9, 16, 25};
	    Arrays.stream(arr)
              .filter(n -> n % 2 == 0)
              .forEach(n -> System.out.print(n + " "));
	                                        
	}
}


// Output : 4 16
