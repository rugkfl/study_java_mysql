package codingtest.baekjoon.Level_03;
import java.util.ArrayList;
import java.util.Scanner;

public class class_8393 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    
        ArrayList<Integer> arrNum = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
           arrNum.add(i);
        }

        int sum = 0;
        for(int i = 0; i < arrNum.size(); i++){
            sum += arrNum.get(i); // get의 배열 값을 가져오는 함수
        }
        System.out.println(sum);
        
        scanner.close();
    }
    
}
