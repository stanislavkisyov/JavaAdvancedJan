package exercise.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Long> result = new LinkedHashMap<>();
        while (true) {
            String resources = scanner.nextLine();
            if ("stop".equals(resources)) {
                break;
            }
            long quantity = Long.parseLong(scanner.nextLine());
            if (!result.containsKey(resources)) {
                result.put(resources, Long.valueOf(0));
            }
            result.put(resources, result.get(resources)+ quantity);
        }
        for (String s : result.keySet()) {

            System.out.println(s + " -> " + result.get(s));
        }
    }
}
