package lab.functionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class P_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split("\\s+");
        List<String> res = new ArrayList<>();
        Predicate<String> checkUpperCase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        for (int i = 0; i < text.length; i++) {
            if (checkUpperCase.test(text[i])) {
                res.add(text[i]);
            }
        }
        System.out.println(res.size());
        for (String re : res) {
            System.out.println(re);
        }

    }
}
