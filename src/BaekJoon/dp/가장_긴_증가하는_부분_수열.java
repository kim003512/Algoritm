package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        int[] dp = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;

        for(int i=1; i<N; i++){
            dp[i] = 1;

            for(int j=0; j<i; j++){
                // dp[i] <= dp[j]를 만족해야하는 이유.
                // 만약, arr = {10, 10, 30}에 경우
                // 이때, dp 조건을 추가하지 않으면, 단순히 arr만 비교를 하게 되어
                // dp[3] = 3이 되어 버린다.
                // 따라서 초기화를 하면서 dp끼리 비교를하여 중복하여 증가하는 일을 막아야 한다.
                if(seq[j]<seq[i] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max=0;
        for(int i : dp){
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
