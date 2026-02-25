import java.util.*;
public class Main{
    public static int calculateSum(Queue<Integer> queue){
        int size = queue.size();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            int value = queue.poll();
            sum += value;
            queue.offer(value);
        }

        return sum;
    }

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Initial Queue: " + queue);
        System.out.println("Queue Size: " + queue.size());

        if (!queue.isEmpty()) {
            System.out.println("Dequeued Element: " + queue.poll());
        }

        if (!queue.isEmpty()) {
            System.out.println("Current Front: " + queue.peek());
        }

        int sum = calculateSum(queue);
        System.out.println("Sum of Elements: " + sum);

        System.out.println("Final Queue (unchanged): " + queue);
    }
}

/*
Output : 
  Initial Queue: [10, 20, 30, 40, 50]
  Queue Size: 5
  Dequeued Element: 10
  Current Front: 20
  Sum of Elements: 140
  Final Queue (unchanged): [20, 30, 40, 50]

*/
