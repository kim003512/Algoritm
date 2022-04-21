package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] step = new int[N+2];
        int[] dp = new int[N+2];

        for(int i=1; i<=N; i++){
            step[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = step[1];
        dp[2] = Math.max(step[1] + step[2], step[2]);

        for(int i=3; i<=N; i++){
            dp[i] = Math.max(dp[i-2]+step[i], dp[i-3]+step[i-1]+step[i]);
        }

        System.out.println(dp[N]);

        /**
         *int max = step[N-1];

        for(int i=N-1; i>=0;){
            if(i-2 < 0){
                max += step[i-1];
                break;
            } else{
                if(step[i-1] > step[i-2]){
                    max += step[i-1];
                    i = i-1;
                } else{
                    max += step[i-2];
                    i = i-2;
                }
            }
        }

        System.out.println(max);
         *
         */
    }

}
