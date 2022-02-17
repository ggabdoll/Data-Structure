package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue {

    public static int[] queue;
    public static int size = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        queue = new int[N];

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static int back() {
        if (size == 0) {
            return -1;
        }
        return queue[size - 1];
    }

    public static void push(int X) {
        queue[size] = X;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int response = queue[0];
            queue[0] = queue[1];
            size--;
            return response;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size <= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size == 0) {
            return -1;
        }
        return queue[0];
    }


}
