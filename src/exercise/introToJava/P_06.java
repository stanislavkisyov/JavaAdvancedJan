package exercise.introToJava;

        import java.util.Scanner;

public class P_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.println(i + " + " + j + " = " + target);
                } else if (i - j == target) {
                    System.out.println(i + " - " + j + " = " + target);
                }
            }
        }
    }
}
