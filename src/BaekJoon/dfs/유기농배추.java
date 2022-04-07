package BaekJoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유기농배추 {
    static int N, M, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; //상하좌우 이동
    static int[] dy = {0, 0, -1, 1};
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            cnt=0; //test_case별로 초기화

            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                map[a][b] = 1;
            }

            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if(map[x][y]==1 && visited[x][y]==false){
                        dfs(x, y);
                        cnt++;
                    }

                }
            }
            System.out.println(cnt);
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int now_x = x + dx[i];
            int now_y = y + dy[i];

            if(now_x>=0 && now_x<N && now_y>=0 && now_y<M){
                if(map[now_x][now_y]==1 && visited[now_x][now_y]==false){
                    dfs(now_x, now_y);
                }
            }
        }
    }
}

