package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> namesAndEmail = new LinkedHashMap<>();

        String line;
        while (!"end".equalsIgnoreCase(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            String name = tokens[0] + " " + tokens[1];
            String email = tokens[2];
            namesAndEmail.putIfAbsent(name, email);
        }

        namesAndEmail.entrySet().stream()
                .filter(s -> s.getValue().contains("@gmail.com"))
                .forEach(s -> System.out.println(s.getKey()));

    }
}
