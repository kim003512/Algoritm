package SW_Expert_Academy.SW_문제해결_기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Flatten_1208 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<10; i++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[100];

            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<100; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int dump=0; dump<N; dump++){
                Arrays.sort(arr);
                //if(arr[arr.length-1] - arr[0] <= 1) break;
                arr[0]++;
                arr[arr.length-1]--;
            }

            Arrays.sort(arr);

            System.out.printf("#%d %d\n", i+1, (arr[arr.length-1]-arr[0]));
        }
    }
}
