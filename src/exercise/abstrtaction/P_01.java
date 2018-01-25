package exercise.abstrtaction;

import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int matrixLength = Integer.parseInt(input[0]);
        String typeMatrix = input[1];
        int[][] matrix = new int[matrixLength][matrixLength];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix[matrixLength].length; col++) {
                matrix[row][col] = 1;
            }
        }
    }
}
