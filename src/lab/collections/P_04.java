package lab.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parking = new HashSet<>();

        String line = "";
        while (!"end".equalsIgnoreCase(line = scanner.nextLine())) {
            String[] input = line.split(", ");
            String commands = input[0];
            String carNumber = input[1];

            if (commands.equalsIgnoreCase("in")) {
                parking.add(carNumber);
            } else {
                parking.remove(carNumber);
            }
        }

        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parking) {
                System.out.println(car);
            }
        }
    }
}



