package exercise.collections;

import java.util.*;

public class P_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        String line = "";
        while (!"joker".equalsIgnoreCase(line = scanner.nextLine())) {
            String[] input = line.split(":\\s+");
            String[] cards = input[1].split(",\\s+");
            for (int i = 0; i < cards.length; i++) {
                String name = input[0];
                if (!players.containsKey(name)) {
                    players.put(name, new HashSet<>());
                }
                players.put(name, players.get(name)).add(cards[i]);
            }
        }
        for (Map.Entry<String, HashSet<String>> player : players.entrySet()) {
            String name = player.getKey();
            Set<String> playerCards = player.getValue();

            int sumCardsPoint = 0;
            for (String playerCard : playerCards) {
                sumCardsPoint += calcPlayerPoints(playerCard);
            }

            System.out.printf("%s: %d%n", name, sumCardsPoint);
        }
        System.out.println();
    }

    private static int calcPlayerPoints(String playerHands) {
        Map<String, Integer> cardPower = new HashMap<>();
        Map<String, Integer> cardType = new HashMap<>();

        for (int i = 2; i <= 10; i++) {
            cardPower.put(Integer.toString(i), i);
        }

        cardPower.put("J", 11);
        cardPower.put("Q", 12);
        cardPower.put("K", 13);
        cardPower.put("A", 14);

        cardType.put("C", 1);
        cardType.put("D", 2);
        cardType.put("H", 3);
        cardType.put("S", 4);

        String currentCardPower = playerHands.substring(0, playerHands.length() - 1);
        String currentCardType = playerHands.substring(playerHands.length() - 1);
        int currentCardsPoints = cardPower.get(currentCardPower) * cardType.get(currentCardType);
        return  currentCardsPoints;
    }
}
