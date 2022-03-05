package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Card2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        for (int i = 0; i < N - 1; i++) {
            dq.pollFirst();
            int next = dq.peekFirst();
            dq.addLast(next);
            dq.pollFirst();
        }
        System.out.println(dq.peekFirst());
    }
}
