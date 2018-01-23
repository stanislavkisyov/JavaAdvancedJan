package lab.introToJava;

import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String[] nums = scanner.nextLine().split("\\s+");
        String secondWords = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }

        System.out.println(firstInput + " " + secondWords + " " + sum);
    }
}
