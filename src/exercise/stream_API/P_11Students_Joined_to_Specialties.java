package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P_11Students_Joined_to_Specialties {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> data = new TreeMap<>();

        String line;
        while (!"Students:".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            String facNum = tokens[2];
            String speciality = tokens[0] + " " + tokens[1];
            data.putIfAbsent(facNum, new ArrayList<>());
            data.get(facNum).add(speciality);
        }


        List<String> input = new ArrayList<>();
        while (!"end".equalsIgnoreCase(line = reader.readLine())) {
            input.add(line);
        }

        for (String fac : data.keySet()) {
            input.stream().filter(s -> s.split("\\s+")[0].contains(fac))
                    .forEach(s ->
                            System.out.println(s.split("\\s+")[1] +" " +fac + " "
                                    + data.get(fac).toString().replaceAll("[\\[\\],]","")));
        }
    }
}
