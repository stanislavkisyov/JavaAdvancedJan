package lab.functionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class P_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = Arrays.stream(reader.readLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        Function<Double, Double> addVat = x -> x * 1.2;
        System.out.println("Prices with VAT:");
        for (double number : numbers) {
            System.out.println(String.format("%.2f", addVat.apply(number)).replaceAll("[\\.]",","));
        }
    }
}
