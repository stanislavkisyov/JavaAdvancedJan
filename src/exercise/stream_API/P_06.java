package exercise.stream_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> namesAntPhoneNumber = new LinkedHashMap<>();

        while (true) {
            String line = reader.readLine();
            if ("end".equalsIgnoreCase(line)) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String name = tokens[0] + " " + tokens[1];
            String phoneNumber = tokens[2];
            namesAntPhoneNumber.putIfAbsent(name, phoneNumber);
        }

        namesAntPhoneNumber.entrySet().stream()
                .filter(s-> {
                    String phone = s.getValue();
                    return phone.startsWith("02") || phone.startsWith("+359");
                }).forEach(s -> System.out.println(s.getKey()));
    }
}
