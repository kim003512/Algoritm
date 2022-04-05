package BaekJoon.dfs;

import java.io.IOException;

//모든 노드를 방문하고자 하는 경우 사용(완전 탐색 알고리즘)
public class main_dfs {
    static boolean visited[];
    static int map[][];
    static int N, M;

    public static void main(String[] args) throws IOException {

    }

    static void dfs(int i) {
        visited[i] = true;

        for (int j = 1; j < N + 1; j++) {
            if (map[i][j] == 1 && visited[j] == false) {
                dfs(j); //재귀귀
            }

        }
    }
}
