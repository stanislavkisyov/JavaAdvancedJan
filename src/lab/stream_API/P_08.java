package lab.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> bounds = Arrays.stream(reader.readLine()
                .split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        List<String> tokens = Arrays.asList(reader.readLine().split("\\s+"));

        List<Integer> filteredNum = tokens.stream()
                .filter(s -> !s.isEmpty() && s != null)
                .map(Integer::valueOf)
                .filter(x -> Collections.min(bounds) <= x && x <= Collections.max(bounds))
                .collect(Collectors.toList());

        if (filteredNum.isEmpty()) {
            return;
        } else {
            for (Integer integer : filteredNum) {
                System.out.print(integer + " ");
            }
        }
    }
}
