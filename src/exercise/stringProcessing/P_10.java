package exercise.stringProcessing;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line ="";
        String pattern = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";

        while (!"end".equals(line = scanner.nextLine())) {
            if (Pattern.matches(pattern, line)) {
                System.out.println(line);
            }

        }
    }
}
