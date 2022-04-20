package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {
    static int[][] tri; //삼각형 입력받는 배열
    static Integer[][] dp; //경로 합을 갖는 배열
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
        
        //가장 마지막행은 동일하게 저장
        for(int i=0; i<N; i++){
            dp[N-1][i] = tri[N-1][i];
        }

        System.out.println(dp_find(0, 0));
    }

    //bottom-up 방식
   static int dp_find(int d, int x){ //행, 열
        if(d == N-1) return dp[d][x]; //맨 밑 행 도달 시 해당 인덱스 반환

        if(dp[d][x] == null){ //아직 탐색하지 않은 위치라면
            //바로 다음 행의 인덱스와 그 오른쪽 인덱스 중 큰 값을 찾아 현재 인덱스값과 더하여
            dp[d][x] = Math.max(dp_find(d +1, x), dp_find(d+1, x+1)) + tri[d][x];
        }
        return dp[d][x];
    }
}
