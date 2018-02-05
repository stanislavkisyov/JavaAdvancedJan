package exercise.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isBalansed(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBalansed(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '{' || currentSymbol == '(' || currentSymbol == '[') {
                stack.addFirst(currentSymbol);
            } else {
                if (!stack.isEmpty()) {
                    char first = stack.pop();
                    if (first == '{') {
                        if (currentSymbol != '}') {
                            return false;
                        }
                    } else if (first == '[') {
                        if (currentSymbol != ']') {
                            return false;
                        }
                    } else if (first == '(') {
                        if (currentSymbol != ')') {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
            return true;
    }
}
