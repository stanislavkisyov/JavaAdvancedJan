package exercise.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int numberOfElements = Integer.valueOf(input[0]);
        int popElements = Integer.parseInt(input[1]);
        int searchElements = Integer.valueOf(input[2]);
        int smallElement = Integer.MAX_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();
        String[] currentElement = scanner.nextLine().split("\\s+");
        for (int i = 0; i < numberOfElements; i++) {
            int num = Integer.valueOf(currentElement[i]);
            deque.push(num);

        }
        while (popElements-- > 0) {
            deque.pop();
        }


        if (deque.contains(searchElements)) {
            System.out.println("true");
        } else if (deque.isEmpty()) {
            System.out.println("0");
        } else {
            for (Integer integer : deque) {
                if (smallElement > integer) {
                    smallElement = integer;
                    System.out.println(smallElement);
                }
            }
        }
    }
}
