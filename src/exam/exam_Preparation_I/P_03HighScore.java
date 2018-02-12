package exam.exam_Preparation_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P_03HighScore {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Long> playerPoints = new LinkedHashMap<>();
        Map<String, List<String>> playerOpponent = new HashMap<>();
        while (true) {
            String[] input = reader.readLine().split("[\\s+<\\->]+");
            if ("osu!".equals(input[0])) {
                break;
            }
            long pointsPlayer1 = Long.valueOf(input[0]);
            String namesPlayer1 = input[1];
            String namePlayer2 = input[2];
            long pointsPlayer2 = Long.valueOf(input[3]);

            fillMaps(playerOpponent, playerPoints, namePlayer2, namesPlayer1, pointsPlayer1, pointsPlayer2);
            fillMaps(playerOpponent, playerPoints, namesPlayer1, namePlayer2, pointsPlayer2, pointsPlayer1);

        }
        StringBuilder result = new StringBuilder();
        playerPoints.entrySet().stream().sorted((a, b)-> Long.compare(b.getValue(), a.getValue()))
                .forEach(v ->{
                    result.append(v.getKey()).append(" - (").append(v.getValue()).append(")").append("\n");
                    playerOpponent.get(v.getKey()).forEach(s -> result.append(s).append("\n"));
                });
        System.out.println(result);
    }

    private static void fillMaps(Map<String, List<String>> playerOpponent, Map<String, Long> playerPoints, String namePlayer2, String namesPlayer1, long pointsPlayer1, long pointsPlayer2) {
        playerPoints.putIfAbsent(namesPlayer1, 0L);
        playerPoints.put(namesPlayer1, playerPoints.get(namesPlayer1) + (pointsPlayer1 - pointsPlayer2));

        playerOpponent.putIfAbsent(namesPlayer1, new ArrayList<>());
        playerOpponent.get(namesPlayer1).add("*   " + namePlayer2 + " <-> " + (pointsPlayer1 - pointsPlayer2));
    }
}
