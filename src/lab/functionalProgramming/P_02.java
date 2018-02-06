package lab.functionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class P_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(",\\s+");

        Function<String, Integer> parser = x -> Integer.parseInt(x);
        int sum = 0;
        for (String s : input) {
            sum += parser.apply(s);
        }

        System.out.println(String.format("Count = %d", input.length));
        System.out.println(String.format("Sum = %d", sum));

    }
}
