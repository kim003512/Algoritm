package SW_Expert_Academy.diffi3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일요일_13229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for(int i=1; i<=N; i++){
            String day = br.readLine();

            int n=0;

            if(day.equals("SUN"))
                n   =7;
            else
                n = 6-Arrays.asList(days).indexOf(day);

            System.out.println("#"+i+" "+n);
        }
    }
}
