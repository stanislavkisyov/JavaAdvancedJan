package exam.exam_Preparation_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_02Ascend {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("([,_])([a-zA-Z]+)([0-9])");

        Map<String, String> map = new LinkedHashMap<>();

        while (true) {
            String line = reader.readLine();
            for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                line = line.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
            }
            if ("Ascend".equals(line)) {
                break;
            }
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                StringBuilder builder = new StringBuilder();
                String match = matcher.group();
                String token = matcher.group(1);
                String target = matcher.group(2);
                int digit = Integer.valueOf(matcher.group(3));

                if (",".equals(token)) {
                    for (int i = 0; i < target.length(); i++) {
                        builder.append((char) (target.charAt(i) + digit));
                    }
                } else {
                    for (int i = 0; i < target.length(); i++) {
                        builder.append((char) (target.charAt(i) - digit));
                    }
                }
                map.put(match, builder.toString());
                line = line.replaceAll(match, builder.toString());
            }
            System.out.println(line);
        }
    }
}
