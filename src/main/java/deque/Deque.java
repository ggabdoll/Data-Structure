package deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Deque {

    public static int[] deque;
    public static int size = 0;
    public static ArrayDeque<Integer> dq = new ArrayDeque<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        deque = new int[N];

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    pop("pop_front");
                    break;
                case "pop_back":
                    pop("pop_back");
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                    if (dq.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    frontEnd("front");
                    break;
                case "back":
                    frontEnd("back");
            }
        }

        System.out.println(sb);
    }

    static void pop(String command) {
        if (dq.isEmpty()) {
            sb.append(-1).append("\n");
        } else if (command.equals("pop_front")) {
            sb.append(dq.pollFirst()).append("\n");
        } else {
            sb.append(dq.pollLast()).append("\n");
        }
    }

    static void frontEnd(String command) {
        if (dq.isEmpty()) {
            sb.append(-1).append("\n");
        } else if (command.equals("front")) {
            sb.append(dq.peekFirst()).append("\n");
        } else {
            sb.append(dq.peekLast()).append("\n");
        }
    }

}
