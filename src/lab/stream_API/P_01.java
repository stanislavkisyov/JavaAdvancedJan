package lab.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::valueOf).collect(Collectors.toList());

        Predicate<Integer> filter = n -> 10 <= n && n <= 20;

        Consumer<Integer> print = n -> System.out.print(n + " ");

        nums.stream().filter(filter)
                .distinct()
                .limit(2)
                .forEach(print);
    }
}
