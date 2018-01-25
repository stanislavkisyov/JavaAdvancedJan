package exercise.introToJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String[] tokens = scanner.nextLine().split("\\s+");
        List<Integer> result = new ArrayList<>();
        String commands = tokens[2];
        int count = 0;
        int numberOfElements = Integer.parseInt(tokens[1]);

        for (int i = 0; i < input.length; i++) {

            int temp = Integer.parseInt(input[i]);
            if (commands.equals("odd") && temp % 2 != 0) {
                System.out.print(temp + " ");
                count++;
                if (count == numberOfElements) {
                    break;
                }
            } else if (commands.equals("even") && temp % 2 == 0) {
                System.out.print(temp + " ");
                count++;
                if (numberOfElements == count) {
                    break;
                }
            }
        }

    }
}
