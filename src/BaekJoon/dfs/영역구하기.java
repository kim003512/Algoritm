package BaekJoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 영역구하기 {
    static int map[][];
    static int M, N, K;
    static int a, b, c, d;
    static int cnt;
    static int[] dx = {-1, 1, 0, 0}; //상하좌우 이동
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());

            for (int x = b; x <= d - 1; x++) {
                for (int y = a; y <= c - 1; y++) {
                    map[x][y] = 1;
                }
            }
        }

        list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    cnt=0; //전역에서 선언 X
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for (Integer c : list)
            System.out.print(c + " ");

    }

    static void dfs(int x, int y) {
        map[x][y] = 1;
        cnt++;

        for (int k = 0; k < dx.length; k++) {
            int now_x = x + dx[k];
            int now_y = y + dy[k];

            if (now_x >= 0 && now_x < N && now_y >= 0 && now_y < M) {
                if (map[now_x][now_y] == 0) {
                    dfs(now_x, now_y);
                }
            }
        }
    }
}
