package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] str_array = new String[str.length()];

        for(int i=0; i< str_array.length; i++){
            str_array[i] = str.substring(i, str_array.length);
        }

        Arrays.sort(str_array);

        for(int i=0; i<str_array.length; i++){
            System.out.println(str_array[i]);
        }
    }
}
