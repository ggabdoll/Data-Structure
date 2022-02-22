import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        sb.append(checkZero(N, br.readLine()));


        System.out.println(sb);
    }

    public static Integer checkZero(int n, String brackets) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < n; i++) {

            if (brackets == "0") {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(brackets));
            }
            result = +stack.peek();
            System.out.printf("Result::", stack.peek());
        }

        if (!stack.isEmpty()) {
            return 0;
        }
        return result;
    }
}
