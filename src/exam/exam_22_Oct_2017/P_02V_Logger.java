package exam.exam_22_Oct_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class P_02V_Logger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Set<String>> followers = new LinkedHashMap<>();
        Map<String, Set<String>> following = new LinkedHashMap<>();
        Set<String> vloggers = new HashSet<>();
        String line;
        while (!"Statistics".equals(line = reader.readLine())) {

            String[] tokens = line.split("\\s+");
            String vloggerName = tokens[0];
            String command = tokens[1];

            if ("joined".equals(command)) {
                vloggers.add(vloggerName);
            } else {
                String followedName = tokens[2];
                if (vloggers.contains(vloggerName) && !vloggerName.equals(followedName)) {
                    followers.putIfAbsent(followedName, new TreeSet<>());
                    followers.put(followedName, followers.get(followedName)).add(vloggerName);

                    following.putIfAbsent(vloggerName, new LinkedHashSet<>());
                    following.put(vloggerName, following.get(vloggerName)).add(followedName);
                }
            }
        }
        System.out.println(String.format("The V-Logger has a total of %d vloggers in its logs.", vloggers.size()));
    }
}
