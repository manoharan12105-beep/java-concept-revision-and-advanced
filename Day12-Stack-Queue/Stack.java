import java.util.*;
public class Main {
    public static int calculateSum(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        int sum = 0;
        
        while (!stack.isEmpty()) {
            int value = stack.pop();
            sum += value;
            temp.push(value);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return sum;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Initial Stack: " + stack);
        System.out.println("Stack Size: " + stack.size());

        if (!stack.isEmpty()) {
            System.out.println("Popped Element: " + stack.pop());
        }

        if (!stack.isEmpty()) {
            System.out.println("Current Top: " + stack.peek());
        }

        int sum = calculateSum(stack);
        System.out.println("Sum of Elements: " + sum);

        System.out.println("Final Stack (unchanged): " + stack);
    }
}
/*
Output
  Initial Stack: [10, 20, 30, 40, 50]
  Stack Size: 5
  Popped Element: 50
  Current Top: 40
  Sum of Elements: 100
  Final Stack (unchanged): [10, 20, 30, 40]
*/
