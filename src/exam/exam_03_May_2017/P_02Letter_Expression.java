package exam.exam_03_May_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_02Letter_Expression {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        List<String> nums = new ArrayList<>();
        List<String> text = new ArrayList<>();
        Pattern pattern = Pattern.compile("([\\.\\d]+)([a-zA-Z]+)?");
        Matcher matcher = pattern.matcher(input);
        double sum = 0;
        while (matcher.find()) {
            nums.add(matcher.group(1));
            text.add(matcher.group(2));

        }
        for (int i = 0; i < nums.size() - 1; i++) {
            double currentElement = Double.parseDouble(nums.get(i));
            if (i == 0) {
                sum += currentElement;
                i++;
            }
            String tokens = text.get(i);
            if (tokens.length() % 2 != 0) {
                sum -= currentElement;
            } else {
                sum += currentElement ;
            }
        }
        System.out.println(sum);
    }
}
