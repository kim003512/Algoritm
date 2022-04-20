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
//                System.out.println("i=" + i + " ,j="+j);
//                System.out.println(seq[j] + " " + seq[i]);
//                System.out.println(dp[i] + " " + dp[j]);

                if(seq[j]<seq[i] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                    //System.out.println(dp[i]);
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
