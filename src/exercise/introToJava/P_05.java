package exercise.introToJava;

import java.util.Scanner;

public class P_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        if (input.length % 2 == 1) {
            System.out.println("invalid length");

        } else {
            for (int i = 0; i < input.length - 1; i += 2) {
                int currentNum = Integer.parseInt(input[i]);
                int temp = Integer.parseInt(input[i + 1]);
                if (currentNum % 2 == 0 && temp % 2 == 0) {
                    System.out.println(String.format("%d, %d -> both are even", currentNum, temp));
                } else if (currentNum % 2 != 0 && temp % 2 != 0) {
                    System.out.println(String.format("%d, %d -> both are odd", currentNum, temp));
                } else {
                    System.out.println(String.format("%d, %d -> different", currentNum, temp));

                }
            }
        }
    }
}
