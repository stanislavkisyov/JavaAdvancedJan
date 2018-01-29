package exercise.stringProcessing;

import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String target = scanner.nextLine().toLowerCase();
        int index = input.indexOf(target);
        StringBuilder sb = new StringBuilder(input);
        int count = 0;

        while (index != -1) {
            count++;
            sb = sb.deleteCharAt(index);
            input = sb.toString();
            index = input.indexOf(target);
        }
        System.out.println(count);
    }
}
