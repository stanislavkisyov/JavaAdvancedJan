package lab.stream_API;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Optional;



public class P_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> tokens = Arrays.asList(reader.readLine().split("\\s+"));

        Optional<Integer> sum = tokens.stream()
                .filter(s -> isNumbers(s))
                .map(Integer::parseInt)
                .reduce((x,y) -> x + y);

        if (sum.isPresent()) {
            System.out.println(sum.get());
        } else {
            System.out.println("No match");
        }
    }

    private static boolean isNumbers(String s) {
        if (s.isEmpty()) {
            return false;
        }
        try {
            int num = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
