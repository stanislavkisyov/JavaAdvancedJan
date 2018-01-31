package lab.stringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";

        while (!"END".equalsIgnoreCase(line)) {
            Pattern pattern = Pattern.compile("(<.*?>)");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
            line = scanner.nextLine();
        }
    }
}
