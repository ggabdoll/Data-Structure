import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchNum1920 {

    public static int[] arr;
    public static int arrSize;
    public static int searchCount;


    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        arrSize = Integer.parseInt(br.readLine());
        arr = new int[arrSize];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrSize; i++) {
            add(i, st.nextToken());
        }

        searchCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < searchCount; i++) {
            sb.append(get(st.nextToken())).append("\n");
        }

        System.out.println(sb);

    }

    public static void add(int i, String el) {
        arr[i] = Integer.parseInt(el);
    }

    public static int get(String val) {
        for (int i = 0; i < searchCount; i++) {
            if (arr[i] == Integer.parseInt(val)) {
                return 1;
            }
        }
        return 0;
    }
}
