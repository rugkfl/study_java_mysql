package codingtest.baekjoon.Level_03;
import java.util.ArrayList;
import java.util.Scanner;

public class class_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 총 금액
        int n = scanner.nextInt(); // 구매한 물건의 종류 수
        
        ArrayList<Integer> arrNum = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int multiNum = a * b;
            arrNum.add(multiNum);
        }

        int sum = 0;
        for(int i = 0; i < arrNum.size(); i++){
            sum += arrNum.get(i);
        }
        if(sum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();

    }
    
}
