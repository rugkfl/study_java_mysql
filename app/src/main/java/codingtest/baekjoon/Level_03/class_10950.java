package codingtest.baekjoon.Level_03;
import java.util.Scanner;

public class class_10950 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for(int i = 1; i <= testCase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }

        scanner.close();
        
    }
   
}
