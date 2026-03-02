import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 4, 9, 16, 25};
        int secondMax = Arrays.stream(arr)
                              .distinct()
                              .boxed()
                              .sorted(Comparator.reverseOrder())
                              .skip(1)
                              .findFirst()
                              .orElseThrow();

        System.out.println("Second Maximum: " + secondMax);
	                                        
	}
}

//Output : Second Maximum: 16
