package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 상근이의_여행 {
    static int[][] plane;
    static boolean[] visited;
    static int N, M, plane_cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 1; i <= test_case; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); //국가의 수
            M = Integer.parseInt(st.nextToken()); //비행기의 수
            plane_cnt = 0;

            plane = new int[N+1][N+1];
            visited = new boolean[N+1];

            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int country1 = Integer.parseInt(st.nextToken());
                int country2 = Integer.parseInt(st.nextToken());

                plane[country1][country2] = plane[country2][country1] = 1;
            }

            bfs(1);

            System.out.println(plane_cnt-1);
        }
    }

    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(x);
        visited[x] = true;

        while(!queue.isEmpty()){
            plane_cnt++;
            int nowX = queue.poll();

            for(int i=1; i<=N; i++){
                if(plane[nowX][i]!=0 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    /**
    static int dfs(int nowX) {
        for (int i = 1; i <= N; i++) {
            plane_cnt++;
            if(plane[nowX][i] == 1 && visited[nowX] == 0 || visited[i]== 0){
                if(visited[nowX] == 0) visited[nowX] = 1;
                if(visited[i] == 0) visited[i] = 1;

            }
            nowX++;
        }


        return plane_cnt-1;
    }*/
}

