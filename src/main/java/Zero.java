import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(checkZero(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }

    public static String checkZero(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char el : brackets.toCharArray()) {
            if (el == '0') {
                stack.pop();
            } else {
                stack.push(el);
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
