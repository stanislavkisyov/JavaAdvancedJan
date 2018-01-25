package lab.abstraction;

import java.util.*;

public class P_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];

        List<Character> vowel = new ArrayList<>();
        Collections.addAll(vowel, 'a', 'o', 'u', 'e', 'i','A','O','E','I','U');

        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        int[] lineSorted = encryptArreys(names, vowel);
        Arrays.sort(lineSorted);

        printResult(lineSorted);
    }

    private static void printResult(int[] lineSorted) {
        for (int i : lineSorted) {
            System.out.println(i);
        }
    }

    private static int[] encryptArreys(String[] names, List<Character> vowel) {
        int[] lineSorted = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            for (int j = 0; j < names[i].length(); j++) {
                if (vowel.contains(names[i].charAt(j))) {
                    sum += names[i].charAt(j) * names[i].length();
                } else {
                    sum += names[i].charAt(j) / names[i].length();
                }
                lineSorted[i] = sum;
            }
        }
        return lineSorted;
    }

}
