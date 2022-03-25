package BaekJoon.greedy;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] coin = {500, 100, 50, 10, 5, 1};
        int change = 1000 - sc.nextInt();
        int index = 0;
        int answer = 0;

        while(change != 0){
            int temp = change/coin[index];

            change -= temp * coin[index ++];

            answer += temp;
        }

        System.out.println(answer);
    }
}
