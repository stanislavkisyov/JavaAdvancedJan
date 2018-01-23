package exercise.introToJava;

import java.util.Scanner;

public class P_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String firstWords = input[0];
        String secondWords = input[1];
        int sum = 0;

        String maxLength = "";
        String minLength = "";
        if (firstWords.length() > secondWords.length()) {
            maxLength = firstWords;
            minLength = secondWords;
        } else {
            maxLength = secondWords;
            minLength = firstWords;
        }

        for (int i = 0; i < minLength.length(); i++) {
            sum += firstWords.charAt(i) * secondWords.charAt(i);
        }
        for (int i = minLength.length(); i <= maxLength.length() - 1; i++) {
            sum += maxLength.charAt(i);
        }
        System.out.println(sum);
    }
}
