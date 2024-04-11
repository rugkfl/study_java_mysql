package codingtest.baekjoon;
import java.util.Scanner;

public class AdivideB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextInt();
        double secondNum = scanner.nextInt();
        double result = firstNum / secondNum;
        System.out.println(result);
        scanner.close();
    }
    
}

// double || float => 실수형
