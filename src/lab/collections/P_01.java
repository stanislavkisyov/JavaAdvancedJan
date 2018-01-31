package lab.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentElement = input.charAt(i);
            if (currentElement == '(') {
                stack.push(i);
            } else if (currentElement == ')') {
                String res = input.substring(stack.pop(), i + 1);
                System.out.println(res);
            }
        }
    }
}
