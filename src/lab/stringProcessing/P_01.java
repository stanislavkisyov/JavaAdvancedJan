package lab.stringProcessing;

        import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("://");
        if (input.length != 2) {
            System.out.println("Invalid URL");
        } else {
            String protocol = input[0];
            int serverIndex = input[1].indexOf("/");
            String server = input[1].substring(0, serverIndex);
            String resources = input[1].substring(serverIndex + 1);

            System.out.println(String.format("Protocol = %s", protocol));
            System.out.println(String.format("Server = %s", server));
            System.out.println(String.format("Resources = %s", resources));
        }
    }
}
