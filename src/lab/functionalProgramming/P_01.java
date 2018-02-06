package lab.functionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = Arrays.stream(bf.readLine().split(", "))
                .map(Integer::valueOf).collect(Collectors.toList());

        nums.removeIf(num -> num % 2 != 0);
        System.out.println(Arrays.toString(nums.toArray()).replaceAll("[\\[\\]]",""));
        nums.sort(Integer::compareTo);
        System.out.println(Arrays.toString(nums.toArray()).replaceAll("[\\[\\]]", ""));
    }
}
