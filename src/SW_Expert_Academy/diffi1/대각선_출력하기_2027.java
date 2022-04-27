package SW_Expert_Academy.diffi1;

public class 대각선_출력하기_2027 {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            String[] strArray = {"+", "+", "+", "+", "+"};

            if(i == i)
                strArray[i] = "#";

            for(int j=0; j < strArray.length; j++){
                System.out.print(strArray[j]);
            }
            System.out.println();
        }
    }
}
