package exercise.stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> people = new LinkedHashMap<>();

        String line;
        while (!"end".equalsIgnoreCase(line = scanner.nextLine())) {

            String[] input = line.split("\\s+");
            String name = input[0] + " " + input[1];
            int age = Integer.parseInt(input[2]);
            people.put(name, age);
        }
        people.entrySet().stream()
                .filter(s-> (18 <= s.getValue() && s.getValue() <= 24))
                .forEach(s -> System.out.println(s.getKey()+ " " + s.getValue()));
    }
}
