package SW_Expert_Academy.diffi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균값_구하기_2072 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            double sum = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<10; i++){
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.print("#"+test_case+" ");
            System.out.println(String.format("%.0f", sum/10));
        }
    }
}
