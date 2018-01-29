package lab.stringProcessing;

        import java.util.Scanner;

public class P_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (input.contains("<upcase>")) {
            int startIndex = input.indexOf("<upcase>");
            int endIndex = input.indexOf("</upcase>");
            String reminder = input.substring(startIndex + 8, endIndex);
            input = input.replace("<upcase>" + reminder + "</upcase>", reminder.toUpperCase());
        }
        System.out.println(input);
    }
}
