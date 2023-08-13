import java.util.Queue;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        
        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }
        System.out.print(q.peek());
    }
}