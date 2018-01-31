package exercise.stringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(^|\\s+)[a-zA-Z0-9]+([-.]\\w*)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,})";
        String input = "";
        Pattern pattern = Pattern.compile(regex);

        while (!"end".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
