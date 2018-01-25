package lab.abstraction;

import java.util.Scanner;

public class P_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        int bestSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < matrix.length; row++) {
            String[] numbers = scanner.nextLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
            }
        }

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (bestSum < sum) {
                    bestSum = sum;
                    startRow =row;
                    startCol = col;
                }
            }
        }

        System.out.print(matrix[startRow][startCol] + " ");
        System.out.println(matrix[startRow][startCol + 1]);
        System.out.print(matrix[startRow + 1][startCol] + " ");
        System.out.println(matrix[startRow + 1][startCol + 1]);
        System.out.println(bestSum);

    }
}
