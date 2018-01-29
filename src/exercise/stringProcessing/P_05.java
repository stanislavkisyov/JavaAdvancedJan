package exercise.stringProcessing;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\s ,!.?]");
        Set<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String words : input) {
            StringBuilder sb = new StringBuilder(words);
            sb.reverse();
            if (words.equals(sb.toString()) && !words.equals("")) {
                result.add(words);
            }
        }
        System.out.println(result);
    }
}
