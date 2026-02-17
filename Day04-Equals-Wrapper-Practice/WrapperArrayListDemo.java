import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Autoboxing happens here 
        numbers.add(10);
        numbers.add(25);
        numbers.add(40);
        numbers.add(5);
        numbers.add(60);

        System.out.println("Numbers List : " + numbers);
        int sum = 0;
        for(int num : numbers)
            sum += num;

        System.out.println("Sum : " + sum);
        int max = numbers.get(0);
        for(int num : numbers){
            if(num > max)
                max = num;
        }

        System.out.println("Max : " + max);
    }
}

/*
Output : 

Numbers List : [10, 25, 40, 5, 60]
Sum : 140
Max : 60

Link : https://onlinegdb.com/14w4JkiD6
*/
