package lab.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guests = new TreeSet<>();

        String line = "";

        while (!"party".equalsIgnoreCase(line = scanner.nextLine())) {
            guests.add(line);
        }

        while (!"end".equalsIgnoreCase(line = scanner.nextLine())) {
            guests.remove(line);
        }
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
