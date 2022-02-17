package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class VPS {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(checkVPS(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }

    public static String checkVPS(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char el : brackets.toCharArray()) {
            if (el == '(') {
                stack.push(el);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        } else if (stack.isEmpty()) {
            return "YES";
        }
        return null;
    }
}

