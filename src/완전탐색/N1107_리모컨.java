package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N1107_리모컨 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean [] broken = new boolean[10];

        for (int i = 0; i < M; i++) {
            broken[Integer.parseInt(st.nextToken())] = true;
        }

        int result = Math.abs(N - 100);

       

        Scanner keyboard = new Scanner(System.in);


    }
}
