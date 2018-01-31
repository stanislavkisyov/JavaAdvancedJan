package exercise.stringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "<a.*href.*?=.*?(\"|')(.*?)\\1>\\s*(.*?)<\\/a>";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        String input = "";
        StringBuilder sb = new StringBuilder();

        while (!"END".equals(input = scanner.nextLine())) {
            sb.append(input);
            sb.append("\r\n");
        }
        String output = sb.toString();
        Matcher matcher = pattern.matcher(output);

        while (matcher.find()) {
            String replacement = matcher.group(0)
                    .replace("<a", "[URL")
                    .replace("</a>", "[/URL]")
                    .replace(">", "]");
            output = output.replace(matcher.group(0), replacement);
        }

        System.out.println(output);
    }
}
