package 분할정복;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11728_배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N+M];

        st = new StringTokenizer(br.readLine(), " ");
        int index = 0;
        for (int i = 0; i < N; i++) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0 ;i < M; i++) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+ " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
