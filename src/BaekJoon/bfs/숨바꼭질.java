package BaekJoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질{
    static int N, M;
    static int visited[] = new int[100001]; //1부터 시작하기 위해

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N));
    }

    static int bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        int n = 0;
        visited[x] = 1;

        while(!queue.isEmpty()){
            n = queue.poll();

            if(n == M){
                return visited[n] - 1;
            } if(n-1>=0 && visited[n-1]==0){
                visited[n-1] = visited[n] + 1;
                queue.add(n-1);
            } if(n+1<=100000 && visited[n+1]==0){
                visited[n+1] = visited[n] + 1;
                queue.add(n+1);
            } if(2*n<=100000 && visited[2*n]==0){
                visited[2*n] = visited[n] + 1;
                queue.add(2*n);
            }
        }
        return -1;
    }
}
