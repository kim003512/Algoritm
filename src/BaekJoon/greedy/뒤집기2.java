package BaekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 뒤집기2 {
//    static int[][] arr;
//    public static void main(String[] args) throws IOException {
//        //Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
////        int a = sc.nextInt();
////        int b = sc.nextInt();
//        int a = Integer.parseInt(st.nextToken());
//        int b= Integer.parseInt(st.nextToken());
//        arr = new int[a][b];
//        int cnt = 0;
//
//        for(int i=0; i<a; i++){
//            String[] tmp = br.readLine().split("");
//            for(int j=0; j<b; j++){
//                //arr[i][j] = sc.nextInt();
//                arr[i][j] = Integer.parseInt(tmp[j]);
//            }
//        }
//
//        for(int i=0; i<a; i++){
//            for(int j=0; j<b; j++){
//                if(arr[i][j] == 1)
//                    reverse(i, j);
//
//                cnt += 1;
//            }
//        }
//
//        System.out.println(cnt);
//    }
//
//    static void reverse(int a, int b){
//        for(int i =0; i <a ;i++){
//            for(int j=0; j<b; j++){
//                if(arr[i][j] == 1) arr[i][j] = 0;
//                else arr[i][j] = 1;
//            }
//        }
//    }
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;
        arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split("");
            for(int j = 0; j < m ; j++){
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                if(arr[j][i] == 1) {
                    reverse(j, i);

                    answer += 1;
                }

            }
        }

        System.out.println(answer);
    }

    static void reverse(int x, int y) {
        for(int i = 0; i <= x; i++) {
            for(int j = 0; j <= y; j++) {
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }
            }
        }
    }
}
