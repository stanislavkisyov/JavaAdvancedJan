package exercise.stringProcessing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String firstWord = input[0];
        String secondWord = input[1];
        Set<Character> first = new HashSet<>();
        Set<Character> second = new HashSet<>();

        for (int i = 0; i < firstWord.length(); i++) {
            first.add(firstWord.charAt(i));
        }
        for (int i = 0; i < secondWord.length(); i++) {
            second.add(secondWord.charAt(i));
        }

        System.out.println(first.size() == second.size());
    }
}
