import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 4, 9, 16, 25};
        int max = Arrays.stream(arr)
                        .max()
                        .orElseThrow();

        System.out.println("Maximum: " + max);
	                                        
	}
}

//Output : Maximum: 25
