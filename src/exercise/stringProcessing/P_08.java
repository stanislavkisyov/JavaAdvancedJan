package exercise.stringProcessing;

import java.util.Scanner;

public class P_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        String target = scanner.nextLine();

        while (true) {
            int startIndex = input.indexOf(target);
            int endIndex = input.lastIndexOf(target);

            if (startIndex == -1 || endIndex == -1 || "".equals(target)) {
                System.out.println("No shake.");
                break;
            }

            input = input.replace(endIndex, endIndex + target.length(), "");
            input = input.replace(startIndex, startIndex + target.length(), "");
            int index = target.length() / 2;
            target = target.substring(0, index) + target.substring(index + 1);
            System.out.println("Shaked it.");
        }
        System.out.println(input);
    }
}
