package SW_Expert_Academy.diffi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스탬프_찍기_2046 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            System.out.print("#");
        }
    }
}
