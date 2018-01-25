package exercise.introToJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<String> vehicles = new ArrayList<>();
        vehicles.addAll(Arrays.asList(input));
        int count = 0;
        String line;
        while (!"End of customers!".equals(line = scanner.nextLine())) {
            String[] tokens = line.split("\\s+");
            String currentCar = tokens[0].toLowerCase().charAt(0) + tokens[2];
            int totalPrice = 0;
            if (vehicles.contains(currentCar)) {
                totalPrice = currentCar.charAt(0) * Integer.parseInt(tokens[2]);
                System.out.println(String.format("Yes, sold for %d$", totalPrice));
                vehicles.remove(currentCar);
                count++;
            } else {
                System.out.println("No");
            }
        }
        System.out.print("Vehicles left: ");
        System.out.println(vehicles.toString().replaceAll("[\\[\\]]", ""));
        System.out.println("Vehicles sold: " + count);
    }
}
