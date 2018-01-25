package exercise.abstrtaction;

import java.util.Scanner;

public class P_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][col];

        int j = 0;
        char[] alphabetical = new char[26];
        for (char i = 'a'; i <= 'z'; i++) {
            while (j < alphabetical.length) {
                alphabetical[j] = i;
                j++;
                break;
            }
        }

        fillMatrix(matrix, alphabetical);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, char[] alphabetical) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.format("%s%s%s", alphabetical[row], alphabetical[row + col], alphabetical[row]);

            }
        }
    }
}
