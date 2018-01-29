package exercise.stringProcessing;

import java.util.Scanner;

public class P_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {

            int unicode = Character.codePointAt(text, i);
            sb.append(String.format("\\u%04x", unicode));
        }

        System.out.println(sb.toString());
    }
}
