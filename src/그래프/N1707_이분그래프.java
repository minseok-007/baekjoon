package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N1707_이분그래프 {
    static ArrayList<ArrayList<Integer>> arrayLists;

    static final int RED = 1;
    static final int BLUE = -1;
    static int[] colors;
    static boolean checkBipartite;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            arrayLists = new ArrayList<>();
            colors = new int[V+1];
            checkBipartite = true;
            for (int j = 0; j < V+1; j++) {
                arrayLists.add(new ArrayList<>());
                colors[i] = 0;
            }


        }
    }
}
