package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N9095_123더하기 {
    static int cache[] = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int input = Integer.parseInt(st.nextToken());
            int result = calculate(input);
            sb.append(result);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static int calculate(int input) {
        if (input == 0 || input == 1) {
            return 1;
        }
        if (input == 2) {
            return 2;
        }
        if (cache[input] > 0) {
            return cache[input];
        }
        cache[input] = calculate(input-1) + calculate(input-2) + calculate(input-3);
        return cache[input];
    }
}
