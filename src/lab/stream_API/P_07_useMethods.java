package lab.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P_07_useMethods {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");
        int bound = Integer.parseInt(reader.readLine());
        Map<String, List<Integer>> cities = new HashMap<>();

        for (String token : tokens) {
            String[] tokensArgs = token.split(":");
            String city = tokensArgs[0];
            int populations = Integer.parseInt(tokensArgs[1]);

            cities.putIfAbsent(city, new ArrayList<>());
            cities.get(city).add(populations);
        }
        cities.entrySet().stream()
                .filter(getFilterByPopulation(bound))
                .sorted(getSortByDesending())
                .forEach(getPrintMapEntryConsumer());


    }

    private static Consumer<Map.Entry<String, List<Integer>>> getPrintMapEntryConsumer() {
        return kv -> {
            System.out.print(kv.getKey() + ": ");
            kv.getValue().stream()
                    .sorted((s1, s2)-> s2.compareTo(s1))
                    .limit(5)
                    .forEach(dp -> System.out.print(dp + " "));
            System.out.println();
        };
    }

    private static Comparator<Map.Entry<String, List<Integer>>> getSortByDesending() {
        return (kv1, kv2) -> Integer.compare(
                kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                kv1.getValue().stream().mapToInt(Integer::valueOf).sum());
    }

    private static Predicate<Map.Entry<String, List<Integer>>> getFilterByPopulation(int bound) {
        return v -> v.getValue().stream().mapToInt(Integer::valueOf)
                .sum() >= bound;
    }
}
