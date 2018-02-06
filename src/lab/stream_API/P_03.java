package lab.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class P_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");

        Set<Character> letters = new HashSet<>();

        Arrays.stream(reader.readLine().split("\\s+"))
                .map(s -> s.toUpperCase().charAt(0))
                .forEach(s -> letters.add(s));

        Optional<String> firstName = Arrays.stream(input)
                .filter(s -> letters.contains(s.charAt(0)))
                .sorted()
                .findFirst();
        System.out.println(firstName.isPresent() ? firstName.get() : "No match");
    }
}
