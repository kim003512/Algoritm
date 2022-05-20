package BaekJoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 베스트셀러 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String str = br.readLine();

            if(!map.containsKey(str))
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }

        int val = 0;
        String book = "";
        for(String key : map.keySet()) {
            if(val == map.get(key)) {
                if(book.compareTo(key) > 0) {
                    book = key;
                }
            }else if(val < map.get(key)) {
                val = map.get(key);
                book = key;
            }

        }

        System.out.println(book);
    }
}
