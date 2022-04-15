package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {
    static int[][] tri;
    static Integer[][] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        tri = new int[N][N];
        dp = new Integer[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<i+1; j++){
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            dp[N-1][i] = tri[N-1][i];
        }

        System.out.println(dp_find(0, 0));
    }

    static int dp_find(int d, int x){
        if(d == N-1) return dp[d][x];

        if(dp[d][x] == null){
            dp[d][x] = Math.max(dp_find(d +1, x), dp_find(d+1, x+1)) + tri[d][x];
        }
        return dp[d][x];
    }
}
