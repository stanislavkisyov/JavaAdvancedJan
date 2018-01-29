package exercise.stringProcessing;

import java.util.Scanner;

public class P_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum =0;
        for (int i = 0; i < input.length; i++) {
            char firstLetter = input[i].charAt(0);
            char lastLetter = input[i].charAt(input[i].length() - 1);
            double digit = Double.parseDouble(input[i].substring(1, input[i].length() - 1));
            if (isUpper(firstLetter)) {
                digit /= positionInAlphabetical(firstLetter);

            } else {
                digit *= positionInAlphabetical(firstLetter);
            }
            if (isUpper(lastLetter)) {
                digit -= positionInAlphabetical(lastLetter);

            } else {
                digit += positionInAlphabetical(lastLetter);
            }
            sum += digit;
        }
        System.out.println(String.format("%.2f",sum));
    }

    private static int positionInAlphabetical(char firstLetter) {
        int count = 0;
        if (firstLetter >= 65 && firstLetter <= 90) {

            for (char i = 'A'; i <= firstLetter; i++) {
                count++;
            }
        } else {
            for (char i = 'a'; i <= firstLetter; i++) {
                count++;
            }
        }
        return count;
    }

    private static boolean isUpper(char firstLetter) {
        if (firstLetter >= 65 && firstLetter <= 90) {

            return true;
        }
        return false;
    }
}
