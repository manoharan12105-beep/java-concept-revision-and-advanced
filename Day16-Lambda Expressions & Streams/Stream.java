import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){

        List<Integer> marks = Arrays.asList(45, 67, 82, 90, 33, 76, 50);

        List<Integer> passed = marks.stream()
                .filter(m -> m >= 50)
                .collect(Collectors.toList());

        List<Integer> updatedMarks = passed.stream()
                .map(m -> m + 5)
                .collect(Collectors.toList());

        System.out.println("Passed: " + passed);
        System.out.println("Updated: " + updatedMarks);
    }
}

/*
Output :

Passed: [67, 82, 90, 76, 50]
Updated: [72, 87, 95, 81, 55]

*/
