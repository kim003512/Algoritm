package BaekJoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class DFS와BFS {
    static int N, M, V;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[1001][1001];
        visited = new boolean[1001];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        dfs(V);
        visited = new boolean[1001]; //초기화가 필요
        System.out.println();
        bfs(V);
    }

    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(x);
        visited[x] = true;

        while(!queue.isEmpty()){
            int now_x = queue.poll();
            System.out.print(now_x + " ");

            for(int i=1; i<=N; i++){
                if(map[now_x][i]==1 && visited[i]==false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void dfs(int x){
        visited[x] = true;
        System.out.print(x + " ");

        for(int i=1; i<=N; i++){
            if(map[x][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }
}
