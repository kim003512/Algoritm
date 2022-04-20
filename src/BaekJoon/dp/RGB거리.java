package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][3];

        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            //최솟값 입력받기
            //모든 경로의 경우의 수를 찾아 최종적으로 작은 누적합 찾기
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + R;
            //첫번째 색상을 제외한 것 중 최솟값 구하기기
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + G;
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + B;
        }
        System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
    }
}
