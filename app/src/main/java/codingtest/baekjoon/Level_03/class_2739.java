package codingtest.baekjoon.Level_03;
import java.util.Scanner;

public class class_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multipleNum = scanner.nextInt();

        for(int i = 1; i < 10; i++) {
            int result = multipleNum * i;
            System.out.println(multipleNum +" * "+i+" = "+result);
        }
        scanner.close();
    }
    
}
