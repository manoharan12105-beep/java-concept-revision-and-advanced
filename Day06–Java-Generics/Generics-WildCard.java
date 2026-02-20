import java.util.*;
public class Main {

    // 🔹 Producer → Extends
    // This method only READS numbers from the list
    public static double sum(List<? extends Number> list) {
        double total = 0.0;

        for (Number n : list) {   // Safe to read as Number
            total += n.doubleValue();
        }

        // list.add(10); ❌ Not allowed
        return total;
    }

    // 🔹 Consumer → Super
    // This method only ADDS integers to the list
    public static void addIntegers(List<? super Integer> list) {

        list.add(10);   // ✅ Safe
        list.add(20);   // ✅ Safe
        list.add(30);   // ✅ Safe

        // Integer value = list.get(0); ❌ Not safe
        Object value = list.get(0); // Only Object guaranteed
        System.out.println("First element (as Object): " + value);
    }

    // 🔹 Copy method (Classic PECS Example)
    public static void copy(
            List<? super Integer> destination,
            List<? extends Integer> source) {

        for (Integer value : source) {
            destination.add(value);
        }
    }

    public static void main(String[] args) {

        // ---------- Producer Example ----------
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.5);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of doubles: " + sum(doubleList));

        // ---------- Consumer Example ----------
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);

        System.out.println("After adding integers: " + numberList);

        // ---------- Copy Example ----------
        List<Integer> source = Arrays.asList(100, 200, 300);
        List<Number> destination = new ArrayList<>();

        copy(destination, source);

        System.out.println("Copied list: " + destination);
    }
}

/*
Output 

Sum of integers: 10.0
Sum of doubles: 10.5
First element (as Object): 10
After adding integers: [10, 20, 30]
Copied list: [100, 200, 300]

*/
