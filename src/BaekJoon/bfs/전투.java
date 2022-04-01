package BaekJoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 전투 {
    static int N, M;
    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; //상하좌우 이동
    static int[] dy = {0, 0, -1, 1};
    static int black_pw=0, white_pw=0;
    static class Node{
            int x;
            int y;

            public Node(int x, int y){
                this.x = x;
                this.y = y;
            }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new String[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j <M; j++){
                arr[i][j] = line.substring(j ,j+1);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j]){
                    if(arr[i][j].equals("W")){
                        int num = bfs(i,j,"W");
                        white_pw += num*num;
                    } else{
                        int num = bfs(i,j,"B");
                        black_pw += num*num;
                    }
                }
            }
        }

        br.close();
        System.out.println(white_pw + " " + black_pw);
    }

    static int bfs(int x, int y, String color){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;
        int cnt = 1;

        while(!queue.isEmpty()){
            Node poll = queue.poll();
            for(int i=0; i<dx.length; i++){
                int now_x = poll.x + dx[i];
                int now_y = poll.y + dy[i];
                if(now_x >=0 && now_x<N && now_y>=0 && now_y<M){ //해당 점 기준 상하좌우 탐색
                    if(!visited[now_x][now_y] && color.equals(arr[now_x][now_y])){
                        queue.add(new Node(now_x, now_y));
                        visited[now_x][now_y] = true;
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }
}
