package exercise.introToJava;

import java.util.Map;
import java.util.Scanner;

public class P_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalPoints = Integer.MIN_VALUE;
        String whinerName = "";
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int initialScore = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < name.length(); j++) {
                int currentChar = name.charAt(j);
                if (currentChar % 2 == 0) {
                    initialScore += name.charAt(j);
                } else {
                    initialScore -= name.charAt(j);
                }
            }
            if (initialScore > totalPoints) {
                totalPoints = initialScore;
                whinerName = name;
            }
        }
        System.out.println("The winner is " + whinerName + " - " + totalPoints + " points");
    }
}
