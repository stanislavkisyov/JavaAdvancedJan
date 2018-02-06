package exercise.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, LinkedHashMap<String, Long>> data = new LinkedHashMap<>();
        Map<String, Long> countryPopulation = new LinkedHashMap<>();

        String line;
        while (!"report".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\|");

            String city = tokens[0];
            String country = tokens[1];
            long population = Long.valueOf(tokens[2]);

            if (!data.containsKey(country)) {
                data.put(country, new LinkedHashMap<>());
                countryPopulation.put(country, 0L);
            }
            if (!data.get(country).containsKey(city)) {
                data.get(country).put(city, population);
            }
            Long totalPopulation = countryPopulation.get(country);
            countryPopulation.put(country, population + totalPopulation);
        }

        countryPopulation.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                .forEach(entry ->{
                    System.out.println(String.format("%s (total population: %d)", entry.getKey(), entry.getValue()));
                    data.get(entry.getKey()).entrySet().stream().sorted((c1, c2)->
                    c2.getValue().compareTo(c1.getValue())).forEach(pair -> {
                        System.out.println(String.format("=>%s: %d", pair.getKey(), pair.getValue()));
                    });
                });
    }
}
