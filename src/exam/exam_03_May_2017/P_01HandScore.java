package exam.exam_03_May_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_01HandScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, List<String>> hand = new HashMap<>();

        String[] input = reader.readLine().split("\\s+");

        for (String s : input) {
            char key = s.charAt(s.length() - 1);
            String value = s.substring(0, s.length() - 1);
            hand.putIfAbsent(key, new ArrayList<>());
            hand.get(key).add(value);
        }
        long sum = 0;
        for (List<String> strings : hand.values()) {
            long currentSum = 0;
            for (String string : strings) {
                switch (string) {
                    case "J":
                        string = "12";
                        break;
                    case "Q":
                        string = "13";
                        break;
                    case "K":
                        string = "14";
                        break;
                    case "A":
                        string = "15";
                        break;
                }
                currentSum += Integer.parseInt(string);
            }

            sum += currentSum * strings.size();
            currentSum = 0;
        }
        System.out.println(sum);
    }
}
