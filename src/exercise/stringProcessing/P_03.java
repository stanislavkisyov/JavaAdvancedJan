package exercise.stringProcessing;

import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);

        for (String bannedWord : bannedWords) {
            while (text.contains(bannedWord)) {
                text = text.replace(bannedWord, replaceString(bannedWord.length()));
            }
        }
        System.out.println(text);
    }

    private static CharSequence replaceString(int length) {
        String result = "";
         for (int i = 0; i < length; i++) {
             result += "*";
        }
        return result;
    }
}
