package exercise.stringProcessing;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class P_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String input = scanner.nextLine();
        String currentWord = "" + word + " ";
        Pattern pattern = Pattern.compile("(\\S.+?)([.!?])(?=\\s+|$)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String currentLine = matcher.group();
            if (currentLine.contains(currentWord)) {
                System.out.println(currentLine);
            }
        }
    }
}
