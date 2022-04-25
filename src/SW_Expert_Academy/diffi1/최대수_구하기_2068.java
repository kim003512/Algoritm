package SW_Expert_Academy.diffi1;

import java.io.IOException;
import java.util.Scanner;
public class 최대수_구하기_2068 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){

            int max=0;
            for(int i=0; i<10; i++){
                int input = sc.nextInt();
                if(input > max) max = input;
            }

            System.out.println("#"+test_case+" "+max);
        }
    }
}
