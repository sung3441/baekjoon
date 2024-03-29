import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] result = new int[length];
        int index = 0;
        
        while (n > 0) {
            result[index++] = (int) (n % 10);
            n /= 10;
        }
        return result;
    }
}