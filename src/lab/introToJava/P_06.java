package lab.introToJava;

import java.util.Scanner;

public class P_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 10) {
            System.out.printf("Number: %d\n", count);
            count++;
        }
    }
}
