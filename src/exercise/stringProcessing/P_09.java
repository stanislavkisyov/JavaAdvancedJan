package exercise.stringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String tokens = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        while (!"end".equals(line)) {

            if (Pattern.matches(tokens, line)) {
                System.out.println(line);
            }
            line = scanner.nextLine();
        }
    }
}
