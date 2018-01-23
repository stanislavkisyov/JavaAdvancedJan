package lab.introToJava;

import java.util.Scanner;

public class P_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0.0;
        for (int i = 0; i < input.length; i++) {
            sum += Double.parseDouble(input[i]);
        }

        System.out.printf("%.2f", sum / input.length);
    }
}
