package BaekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cook_time = Integer.parseInt(br.readLine());
        int a = 0, b = 0, c = 0;

        if(cook_time >= 300){
            a = cook_time/300;
            cook_time -= 300 * a;
        }
        if(cook_time >= 60){
            b = cook_time/60;
            cook_time -= 60 * b;
        }
        if(cook_time % 10 != 0){
            System.out.println(-1);
            System.exit(0);
        } else {
            c = cook_time/10;

            System.out.println(a + " " + b + " "+ c);
        }
    }
}
