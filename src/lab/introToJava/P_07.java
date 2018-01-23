package lab.introToJava;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        BigDecimal result = new BigDecimal(1);
        for (int i = startIndex; i <= endIndex; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        System.out.printf("product[%d..%d] = %s\n",startIndex, endIndex, result);
    }
}
