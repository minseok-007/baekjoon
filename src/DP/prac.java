package DP;

public class prac {
    public static void main(String[] args) {
        boolean EVEN = true;
        int N = 246;
        while(N > 0 && EVEN == true) {
            if ((N % 10) % 2 == 1) {
                EVEN = false;
            }
        }
        System.out.println(EVEN);
    }
}
