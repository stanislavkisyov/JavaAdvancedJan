package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<String> students = new HashSet<>();
        String line;
        while (!"end".equalsIgnoreCase(line = reader.readLine())) {
            List<String> tokens = Arrays.stream(line.split("\\s+")).filter(s -> s != null && !s.isEmpty())
                    .collect(Collectors.toList());
            if (tokens.isEmpty()) {
                continue;
            }

            String name = tokens.get(0) + " " + tokens.get(1);
            students.add(name);
        }
        students.stream()
                .sorted((e1, e2)-> {
                    if (e1.split("\\s+")[1].compareTo(e2.split("\\s+")[1]) == 0) {
                        return e2.split("\\s+")[0].compareTo(e1.split("\\s+")[0]);
                    } else {
                      return   e1.split("\\s+")[1].compareTo(e2.split("\\s+")[1]);
                    }
                }).forEach(System.out::println);
    }
}
