package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int el = Integer.parseInt(br.readLine());

            if (el == 0) {
                stack.pop();
            } else {
                stack.push(el);
            }
        }

        int result = 0;
        for (int value : stack) {
            result += value;
        }

        System.out.println(result);

    }
}
