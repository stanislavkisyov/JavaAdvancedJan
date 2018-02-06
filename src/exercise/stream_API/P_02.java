package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class P_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> line = new LinkedHashSet<>();
        while (true) {
            String names = reader.readLine().trim();
            if ("end".equalsIgnoreCase(names)) {
                break;
            }
            if (names.isEmpty()) {
                continue;
            } else {
                line.add(names);
            }
            if (line.isEmpty()) {
                return;
            }
        }

        line.stream()
                .filter(s -> s != null && !s.isEmpty())
                .filter(s -> s.split("\\s+")[0].compareTo(s.split("\\s+")[1]) < 0)
                .forEach(System.out::println);
    }
}
