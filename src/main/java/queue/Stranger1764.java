package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Stranger1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> nonHear = new HashSet<>();

        for (int i = 0; i < N; i++) {
            nonHear.add(br.readLine());
        }

        ArrayList<String> person = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String nonShow = br.readLine();
            if (nonHear.contains(nonShow)) {
                person.add(nonShow);
            }
        }

        Collections.sort(person);

        System.out.println(person.size());
        for (String result : person) {
            System.out.println(result);
        }

    }
}
