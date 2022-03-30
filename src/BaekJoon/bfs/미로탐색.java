package BaekJoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; //상하좌우 이동
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                maze[i][j] = line.charAt(j) -'0'; //읽어오는 문자는 문자열 타입이므로 이를 숫자로 변환하기 위해 아스키코드값을 빼준다(0인 48)
                visited[i][j] = false;
            }
        }
        visited[0][0] = true; //시작점 설정
        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y){
        Queue<Integer> dot_x = new LinkedList<Integer>();
        Queue<Integer> dot_y = new LinkedList<Integer>();

        dot_x.offer(x);
        dot_y.offer(y);

        while(!dot_x.isEmpty()){
            int a = dot_x.poll();
            int b = dot_y.poll();

            for(int i=0; i <4; i++){
                //상하좌우 확인
                int now_x = a + dx[i];
                int now_y = b + dy[i];

                if(now_x>=0 && now_y>=0 && now_x<N && now_y<M){
                    if(maze[now_x][now_y] == 1 && visited[now_x][now_y]==false){
                        dot_x.offer(now_x);
                        dot_y.offer(now_y);

                        visited[now_x][now_y] = true;
                        
                        maze[now_x][now_y] = maze[a][b] + 1; //이동횟수
                    }
                }
            }
        }
        return maze[N-1][M-1];
    }
}
