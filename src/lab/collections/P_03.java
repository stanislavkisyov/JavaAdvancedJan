package lab.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int steps = Integer.parseInt(scanner.nextLine());
        Deque<String> queues = new ArrayDeque<>();
        Collections.addAll(queues, input);
        int pos = 1;
        while (queues.size() > 1) {

            for (int i = 1; i < steps; i++) {
                queues.offer(queues.poll());
            }

            if (isPrime(pos)) {
                System.out.println("Prime " + queues.peek());
            } else {
                System.out.println("Removed " + queues.poll());
            }
            pos++;
        }
        System.out.println("Last is " + queues.peek());
    }

    private static boolean isPrime(int pos) {
        if (pos == 1) {
            return false;
        }
        for (int i = 2; i < pos; i++) {
            if (pos % i == 0) {
                return false;
            }
        }
        return true;
    }
}
