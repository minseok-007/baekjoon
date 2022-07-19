package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
public class N10844_쉬운계단수 {
    static long cache[][];
    final static long MOD = 1000000000;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        cache = new long[input+1][10];
        for (int i = 1; i < 10; i++) {
            cache[1][i] = 1L;
        }
        long result = 0;
        for (int i = 2; i <= input; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    cache[i][0] = cache[i-1][1] % MOD;
                }
                else if (j == 9) {
                    cache[i][9] = cache[i-1][8] % MOD;
                }
                else {
                    cache[i][j] = (cache[i-1][j-1] + cache[i-1][j+1])% MOD;
                }
            }
        }
        for (int i= 0; i < 10; i++) {
            result += cache[input][i];
        }
        System.out.println(result % MOD);
    }
}
*/
public class N10844_쉬운계단수 {
    static Long cache[][];
    final static long MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        cache = new Long[input+1][10];
        for (int i = 0; i < 10; i++) {
            cache[1][i] = 1L;
        }
        long result = 0;
        for (int i= 1; i <= 9; i++) {
            result += stair(input, i);
        }
        System.out.print(result%MOD);
    }

    public static long stair(int input, int val) {
        if (input == 1) {
            return cache[input][val];
        }
        if (cache[input][val] == null) {
            if (val == 0) {
                cache[input][val] = stair(input-1, val+1);
            }
            else if (val == 9) {
                cache[input][val] = stair(input-1, val-1);
            }
            else {
                cache[input][val] = stair(input-1, val-1) + stair(input-1, val+1);
            }
        }
        return cache[input][val] % MOD;
    }
}
