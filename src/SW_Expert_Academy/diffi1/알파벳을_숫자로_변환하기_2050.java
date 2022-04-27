package SW_Expert_Academy.diffi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳을_숫자로_변환하기_2050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strArray = str.split("");

        for(int i=0; i< strArray.length; i++){
            char ch = strArray[i].charAt(0);
            int num = (int)ch - 64;

            System.out.print(num + " ");
        }
    }
}
