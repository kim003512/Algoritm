package SW_Expert_Academy.diffi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class 연월일_달력_2056 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] thiryOne = new String[]{"01", "03", "05", "07", "08", "10", "12"};
        String[] thiry = new String[]{"04", "06", "09", "11"};
        String[] twentyEight = new String[]{"02"};

        for(int i=1; i<=N; i++){
            String num = br.readLine();
            String year = num.substring(0, 4);
            String month = num.substring(4,6);
            String day = num.substring(6,8);
            String time;

            if(Arrays.asList(thiryOne).contains(month)){
                if(Integer.parseInt(day)>=1 && Integer.parseInt(day)<=31)
                    time = year + "/" + month +"/" +day;
                else
                    time = "-1";
            } else if(Arrays.asList(thiry).contains(month)){
                if(Integer.parseInt(day)>=1 && Integer.parseInt(day)<=30)
                    time = year + "/" + month +"/" +day;
                else
                    time = "-1";
            } else if(Arrays.asList(twentyEight).contains(month)){
                if(Integer.parseInt(day)>=1 && Integer.parseInt(day)<=28)
                    time = year + "/" + month +"/" +day;
                else
                    time = "-1";
            } else {

                time = "-1";
            }

            System.out.println("#"+i+" "+time);
        }
    }
}
