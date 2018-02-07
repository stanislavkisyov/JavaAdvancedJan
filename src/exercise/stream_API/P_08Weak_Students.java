package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class P_08Weak_Students {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> graders = new LinkedHashSet<>();
        String line;

        while (!"end".equalsIgnoreCase(line = reader.readLine())) {
            graders.add(line);
        }

        graders.stream().filter(s -> s.contains("2") && s.contains("3"))
                .forEach(s -> System.out.println(s.split("\\s+")[0] +" "+ s.split("\\s+")[1]));
    }
}
