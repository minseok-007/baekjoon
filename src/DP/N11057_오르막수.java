package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11057_오르막수 {
    static long cache[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cache = new long[N+1][10];
        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += 오르막(N, i);
        }
        System.out.println(result % 10007);
    }
    public static long 오르막(int digit, int val) {
        if (digit == 1) {
            return 1;
        }
        if (cache[digit][val] > 0) {
            return cache[digit][val];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                cache[digit][i] += 오르막(digit - 1, j);
                cache[digit][i] %= 10007;
            }
        }
        return cache[digit][val];
    }
}
