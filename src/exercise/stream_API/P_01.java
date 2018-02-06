package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class P_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> students = new HashMap<>();
        String line;
        while (!"end".equalsIgnoreCase(line = reader.readLine())) {
            List<String> tokens = Arrays.stream(line.split("\\s+"))
                    .filter(s -> s != null && !s.isEmpty())
                    .collect(Collectors.toList());
            if (tokens.isEmpty()) {
                return;
            }

            String name = tokens.get(0) + " " + tokens.get(1);
            String group = tokens.get(2);
            students.putIfAbsent(name, group);
        }

        students.entrySet().stream()
                .filter(s -> "2".equalsIgnoreCase(s.getValue()))
                .sorted(Comparator.comparing(s2 -> s2.getKey().substring(0, s2.getKey().indexOf(" "))))
                .forEach(s-> System.out.println(s.getKey()));
    }
}
