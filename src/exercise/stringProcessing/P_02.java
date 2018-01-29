package exercise.stringProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class P_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger bigInteger = new BigInteger(num1).add(new BigInteger(num2));
        System.out.println(bigInteger);

    }
}
