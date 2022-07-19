package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11727_2xn타일링_2 {
    static int cache[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        cache = new int[input+1];
        int result = tile(input);
        System.out.println(result);
    }
    public static int tile(int input) {
        if (input == 0 || input == 1) {
            return 1;
        }
        if (cache[input] > 0) {
            return cache[input];
        }
        cache[input] = tile(input-2)+tile(input-2) + tile(input-1);
        cache[input] %= 10007;
        return cache[input];
    }
}
