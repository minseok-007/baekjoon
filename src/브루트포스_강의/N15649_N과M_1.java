package 브루트포스_강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N15649_N과M_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int a[] = new int[10];
        boolean c[] = new boolean[10];
        go(0, N, M);
    }

    public static void go(int index, int N, int M) {
        if (index == M) {
            return;
        }

    }
}
