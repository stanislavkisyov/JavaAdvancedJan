package exercise.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        String line = "";

        while (!"search".equals(line = scanner.nextLine())) {
            String[] input = line.split("-");
            String name = input[0];
            String telephoneNumber = input[1];
            phoneBook.putIfAbsent(name, telephoneNumber);
        }
        while (!"stop".equals(line = scanner.nextLine())) {
            if (phoneBook.containsKey(line)) {
                System.out.println(line + " -> " + phoneBook.get(line));
            } else {
                System.out.println("Contact " + line + " does not exist.");
            }
        }
    }
}
