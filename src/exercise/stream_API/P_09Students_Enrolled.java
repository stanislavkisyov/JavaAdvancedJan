package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P_09Students_Enrolled {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> students = new LinkedHashMap<>();

        while (true) {
            String line = reader.readLine();
            if ("end".equalsIgnoreCase(line)) {
                break;
            }

            List<String> tokens = Arrays.stream(line.split("\\s+"))
                    .collect(Collectors.toList());
            String facNumber = tokens.get(0);
            List<String> grades = tokens.subList(1, tokens.size());
            students.put(facNumber, grades);
        }

        students.entrySet().stream()
                .filter(s -> s.getKey().endsWith("14") || s.getKey().endsWith("15"))
                .forEach(s -> System.out.println(
                        Arrays.toString(s.getValue().toArray()).replaceAll("[,\\[\\]]","")));
    }
}
