package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 일로만들기 {
    static int [] cache;
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        cache = new int[input+1];
        int result = calculate(input);
        System.out.print(result);
    }

    public static int calculate(int input) {
        if (input == 1) return 0;
        if (cache[input] > 0) return cache[input];

        cache[input] = calculate(input - 1) + 1;

        if (input%2 == 0) {
            int temp = calculate(input/2) + 1;
            if (cache[input] > temp) {
                cache[input] = temp;
            }
        }
        if (input%3 == 0) {
            int temp = calculate(input/3) + 1;
            if (cache[input] > temp) {
                cache[input] = temp;
            }
        }
        return cache[input];

    }
}
