package codingtest.baekjoon.Level_01;
import java.util.Scanner;

public class class_11382 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long firstNum, secondNum, thirdNum;
        firstNum = scanner.nextLong();
        secondNum = scanner.nextLong();
        thirdNum = scanner.nextLong();
        System.out.println(firstNum + secondNum + thirdNum);
        scanner.close();
    }
}


// int는 4 바이트 범위
// long 8 바이트 범위
// 큰 정수 값을 저장할 때는 long
// 일반적인 정수 값은 int

// 런타임 에러가 발생한다면 자료형을 바꿔보기