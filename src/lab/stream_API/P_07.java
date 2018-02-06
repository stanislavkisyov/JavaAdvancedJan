package lab.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        Map<String, List<Integer>> cities = new HashMap<>();
        int bound = Integer.parseInt(reader.readLine());

        for (String sity : input) {
            String[] tokens = sity.split(":");
            String city = tokens[0];
            int cityPopulations = Integer.parseInt(tokens[1]);

            cities.putIfAbsent(city, new ArrayList<>());
            cities.get(city).add(cityPopulations);
        }
        cities.entrySet().stream()
                .filter(kv -> kv.getValue()
                .stream()
                .mapToInt(Integer::valueOf)
                .sum() >= bound)
                .sorted((s1,s2)->Integer.compare(s2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        s1.getValue().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(dp -> {
                    System.out.print(dp.getKey() + ": ");
                    dp.getValue().stream().sorted((s1, s2) ->
                            s2.compareTo(s1))
                            .limit(5)
                            .forEach(d -> System.out.print(d + " "));
                    System.out.println();
                });
    }
}
