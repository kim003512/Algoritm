package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        String[] num_array = num.split("");

        Arrays.sort(num_array, Comparator.reverseOrder());

        for(String i : num_array){
            System.out.print(i);
        }
    }
}
