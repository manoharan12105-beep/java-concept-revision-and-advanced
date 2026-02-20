import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Initial List: " + numbers);
        
        numbers.remove(2);
        System.out.println("After Removing Index 2: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));

        int sum = 0;
        for(int num : numbers)
            sum += num;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Size of ArrayList: " + numbers.size());
    }
}

/*
Output 

Initial List: [10, 20, 30, 40, 50]
After Removing Index 2: [10, 20, 40, 50]
Element at index 1: 20
Sum of elements: 120
Size of ArrayList: 4

Link : https://onlinegdb.com/ly3KKF85O
*/
