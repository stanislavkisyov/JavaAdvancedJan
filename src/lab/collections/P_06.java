package lab.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> gradeList = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] grade = scanner.nextLine().split("\\s+");
            double result = 0;

            for (int j = 0; j < grade.length; j++) {
                result += Double.valueOf(grade[j]);
            }
            result /= grade.length;
            gradeList.putIfAbsent(name, result);

        }
        for (String name : gradeList.keySet()) {
            System.out.println(name + " is graduated with " + gradeList.get(name));
        }
    }
}

