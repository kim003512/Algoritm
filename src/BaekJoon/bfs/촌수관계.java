package BaekJoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 촌수관계 {
    static int N, M, start, end, p1, p2;
    static int[][] map;
    static boolean[] visited;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " "); //잘라야하는 위치 위에 지정
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());

        map = new int[N+1][N+1]; //[N+1][M+1]의 경위 arrayIndexoutof 에러 발생
        visited = new boolean[N+1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }
        System.out.println(bfs(p1, p2));
    }

    static Integer bfs(int p1, int p2){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(p1);
        int cnt = 0;

        while(!queue.isEmpty()){
            for(int i=0; i<queue.size(); i++){
                int x = queue.poll();
                visited[x] = true;

                if(x == p2) return cnt;

                for(int j=1; j<=N; j++){
                    if(map[x][j]==1 && visited[j]==false) {
                        queue.offer(i);
                        visited[i] = true;
                    }
                }
            }
            cnt++;
        }
        return -1;
    }
}
