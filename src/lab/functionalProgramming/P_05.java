package lab.functionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPeople = Integer.parseInt(reader.readLine());
        Map<String, Integer> people = new LinkedHashMap<>();
        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = reader.readLine().split(",\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            people.put(name, age);
        }
        String condition = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        String format = reader.readLine();

        Predicate<Integer> tester = createTester(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredStudent(people, tester, printer);
    }

    private static void printFilteredStudent(Map<String, Integer> people,
                                             Predicate<Integer> tester,
                                             Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> stringIntegerEntry : people.entrySet()) {
            if (tester.test(people.get(stringIntegerEntry.getKey()))) {
                printer.accept(stringIntegerEntry);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        if ("name age".equals(format)) {
            return person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
        } else if ("name".equals(format)) {
            return person -> System.out.printf("%s%n", person.getKey());
        } else {
            return person -> System.out.println(person.getValue());
        }
    }

    private static Predicate<Integer> createTester(String condition, int age) {
        if (condition.equals("younger")) {
            return x -> x < age;
        } else {
            return x -> x >= age;
        }
    }

}
