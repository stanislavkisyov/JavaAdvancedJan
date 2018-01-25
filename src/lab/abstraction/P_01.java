package lab.abstraction;

import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double base = Double.parseDouble(input[0]);
        double height = Double.parseDouble(input[1]);

        double area = calculeteArea(base, height);

        printArea(area);
    }

    private static void printArea(double area) {
        System.out.printf("Area = %.2f", area);
    }

    private static double calculeteArea(double base, double height) {

        double area = (base * height) / 2;
        return area;
    }
}
