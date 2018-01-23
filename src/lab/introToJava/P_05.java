package lab.introToJava;

import java.util.Scanner;

public class P_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        if (kilometers <= 20) {
            if (dayOrNight.equals("day")) {
                System.out.printf("%.2f",0.70 + 0.79 * kilometers);
            } else {
                System.out.printf("%.2f",0.70 + 0.90 * kilometers);
            }
        } else if (kilometers <= 100) {
            System.out.printf("%.2f",0.09 * kilometers);
        } else {
            System.out.printf("%.2f",0.06 * kilometers);
        }
    }
}
