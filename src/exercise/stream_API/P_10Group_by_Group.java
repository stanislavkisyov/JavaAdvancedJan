package exercise.stream_API;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P_10Group_by_Group {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, List<String>> students = new TreeMap<>();
        String line;
        while (!"end".equalsIgnoreCase(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            String name = tokens[0] + " " + tokens[1];
            int group = Integer.parseInt(tokens[2]);

            students.putIfAbsent(group, new ArrayList<>());
            students.get(group).add(name);
        }
        students.entrySet()
                .stream()
                .forEach(s ->
                        System.out.println(String.format("%d - %s", s.getKey(),s.getValue()
                                .toString().replaceAll("[\\[\\]]",""))));
    }
}
