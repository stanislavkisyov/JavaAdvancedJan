package exercise.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPumps = Integer.parseInt(reader.readLine());
        Deque<String> allPumps = new ArrayDeque<>();
        for (int i = 0; i < numberOfPumps; i++) {
            allPumps.addLast(reader.readLine());

        }
        int count = 0;
        while (true) {
            long ourFuel = 0L;
            boolean found = true;
            for (String allPump : allPumps) {
                long currentFuel = Long.valueOf(allPump.split(" ")[0]);
                long distance = Long.valueOf(allPump.split(" ")[1]);
                ourFuel += currentFuel;
                if (ourFuel < distance) {
                    found = false;
                    break;
                }
                ourFuel -= distance;
            }
            if (found) {
                System.out.println(count);
                break;
            }
            allPumps.addLast(allPumps.poll());
            count++;
        }
    }
}
