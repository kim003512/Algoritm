package SW_Expert_Academy.diffi1;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값_찾기_2063 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int[] arr = new int[T+1];
        for(int test_case = 1; test_case <= T; test_case++)
        {
            arr[test_case] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[T/2+1]);
    }
}
