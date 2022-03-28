package BaekJoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_bfs {
    static int[][] map;
    static boolean[] visited;
    static StringTokenizer st;
    static int N, M, start, end;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //정점의 개수
        M = Integer.parseInt(br.readLine()); //노드의 개수

        //다음 정점과 연결되어 있고 (map[x][i] == 1), 아직 방문하지 않은 정점이라면(visited[i]==false => 큐에 해당 정점을 넣어준다
        map = new int[N+1][M+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            map[start][end] = 1;
            map[end][start] = 1;
        }

        bfs(1);
    }

    static void bfs(int point){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(point); //추가(값 리턴)
        visited[point] = true;

        while(!queue.isEmpty()){
            int x = queue.poll(); //값 꺼내기/삭제(값 리턴)
            System.out.print(x + " ");
            for(int i = 1; i <=N; i++){
                if(map[x][i] == 1 && visited[i]==false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
