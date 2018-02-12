package exam.exam_22_Oct_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P_01Little_Alchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> goldElement = new ArrayDeque<>();

        String[] input = reader.readLine().split("\\s+");
        for (String s : input) {
            queue.addLast(Integer.valueOf(s));
        }
        while (true) {
            String[] tokens = reader.readLine().split("\\s+");
            if ("Revision".equals(tokens[0])) {
                break;
            }
            String command = tokens[0];
            if (command.equals("Apply")) {
                int n = Integer.parseInt(tokens[2]);
                while (n-- > 0) {
                    if (queue.isEmpty()) {
                        break;
                    }
                    int currentElement = queue.getFirst();
                    if (currentElement > 1) {
                        queue.addLast(queue.pop() - 1);
                    } else {
                        goldElement.addLast(queue.removeFirst());
                    }
                }
            } else {
                int n = Integer.parseInt(tokens[2]);
                if (!goldElement.isEmpty()) {
                    goldElement.pop();
                    queue.addLast(n);
                }
            }
        }
        for (Integer integer : queue) {
            System.out.print(integer + " ");

        }
        System.out.println();
        System.out.println(goldElement.size());
    }
}
