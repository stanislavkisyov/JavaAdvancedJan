package exercise.abstrtaction;

import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];


        for (int row = 0; row < matrix.length; row++) {
            String[] numbers = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
            }
        }

        int diagonalDifferent = calcDiagonalSum(matrix);
        System.out.println(diagonalDifferent);
    }

    private static int calcDiagonalSum(int[][] matrix) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int index = 0; index < matrix.length; index++) {
            diagonal1 += matrix[index][index];

            diagonal2 += matrix[index][matrix.length - 1 - index];
        }

        return Math.abs(diagonal1 - diagonal2);
    }
}
