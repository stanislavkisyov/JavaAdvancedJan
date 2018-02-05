package exercise.collections;

        import java.util.Map;
        import java.util.Scanner;
        import java.util.TreeMap;

public class P_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> result = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!result.containsKey(currentChar)) {
                result.put(currentChar, 1);
            } else {
                result.put(currentChar, result.get(currentChar) + 1);
            }
        }
        for (Character character : result.keySet()) {
            System.out.println(character + ": " + result.get(character) + " time/s");
        }
    }
}
