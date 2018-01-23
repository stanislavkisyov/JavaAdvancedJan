package exercise.introToJava;

import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        int parseToHexa = Integer.parseInt(a, 32);
        System.out.println(parseToHexa);
    }



}
