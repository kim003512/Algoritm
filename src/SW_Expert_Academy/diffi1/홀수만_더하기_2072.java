package SW_Expert_Academy.diffi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 홀수만_더하기_2072 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum=0;

            for(int j=0; j<10; j++){
                int num = sc.nextInt();
                if(num % 2 != 0){
                    sum += num;
                }
            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
    /**
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][10];
        int[] ans = new int[N];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=10; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=10; j++){
                if(arr[i][j] % 2 != 0){
                    cnt += arr[i][j];
                }
            }
            ans[i] = cnt;
            System.out.println("#"+(i)+" "+ans[i]);
            cnt = 0;
        }
    }
     */
}
