package exercise.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numOfElements = Integer.valueOf(input.split(" ")[0]);
        int removeElements = Integer.parseInt(input.split(" ")[1]);
        int searchElement = Integer.valueOf(input.split(" ")[2]);
        int smallElement = Integer.MAX_VALUE;
        String numbers = scanner.nextLine();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numOfElements; i++) {
            int num = Integer.valueOf(numbers.split(" ")[i]);
            queue.offer(num);
        }

        while (removeElements-- > 0) {
            queue.poll();
        }

        if (queue.contains(searchElement)) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println("0");
        } else {

            for (Integer num : queue) {
                if (num < smallElement) {
                    smallElement = num;
                }
            }
            System.out.println(smallElement);
        }

    }
}
