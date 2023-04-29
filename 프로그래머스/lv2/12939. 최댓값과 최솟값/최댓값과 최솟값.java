import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        int max = Arrays.stream(split).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(split).mapToInt(Integer::parseInt).min().getAsInt();
        return min + " " + max;
    }
}