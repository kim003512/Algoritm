package SW_Expert_Academy.SW_문제해결_기본;

import java.util.Scanner;

public class view_1일차 {
    /**
     * max = Math.max(Math.max(arr[i-2], arr[i-2]), Math.max(arr[i+1], arr[i+2])
     * arr[i] - max
     */
    static int N;
    static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T=10;

        for(int test_case=1; test_case<=T; test_case++){
            N = sc.nextInt();
            arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            int cnt=0;
            for(int i = 2; i<N-2; i++){
                int max = Math.max(arr[i-2], Math.max(arr[i-1], Math.max(arr[i+1], arr[i+2])));
                if(arr[i] > max) {
                    cnt += arr[i] - max;
                }
            }
            System.out.println("#"+test_case +" " +cnt);
        }


    }
}
