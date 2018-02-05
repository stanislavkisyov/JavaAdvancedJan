package exercise.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String commandType = input[0];
            switch (commandType) {
                case "1":
                    String toBeAdded = input[1];
                    text.append(input[1]);
                    stack.push(commandType + " " + toBeAdded);
                    break;
                case "2":
                    int count = Integer.valueOf(input[1]);
                    String toBeRemoved = text.substring(text.length() - count);
                    text.replace(text.length() - count, text.length(), "");
                    stack.push(commandType + " " + toBeRemoved);
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    if (stack.size() != 0) {
                        String[] commandsArg = stack.pop().split(" ");
                        String lastCommType = commandsArg[0];
                        String argument = commandsArg[1];
                        switch (lastCommType) {
                            case "1":
                                int length = argument.length();
                                text.replace(text.length() - length, text.length(), "");
                                break;
                            case "2":
                                text.append(argument);
                                break;
                        }
                    }
            }
        }
    }
}
