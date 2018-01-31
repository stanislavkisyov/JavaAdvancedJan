package lab.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int steps = Integer.parseInt(scanner.nextLine());
        Deque<String> queues = new ArrayDeque<>();
        Collections.addAll(queues, input);
        while (queues.size() > 1) {
            for (int i = 1; i < steps; i++) {
                queues.offer(queues.poll());
            }
            System.out.println("Removed " + queues.poll());

        }
        System.out.println("Last is " + queues.peek());
    }
}
