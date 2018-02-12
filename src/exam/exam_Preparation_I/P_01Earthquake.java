package exam.exam_Preparation_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P_01Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Deque<List> allNumbers = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            List<Integer> temp = new ArrayList<>();
            for (String token : tokens) {
                temp.add(Integer.parseInt(token));
            }
            allNumbers.addLast(temp);
        }

        while (!allNumbers.isEmpty()) {
            List<Integer> currentNumber = allNumbers.pop();
            int wave = currentNumber.get(0);
            for (int i = 1; i < currentNumber.size(); i++) {
                if (wave < currentNumber.get(i)) {
                    allNumbers.addLast(currentNumber.subList(i, currentNumber.size()));
                    break;
                }
            }
            output.add(wave);
        }
        System.out.println(output.size());
        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
    }
}
