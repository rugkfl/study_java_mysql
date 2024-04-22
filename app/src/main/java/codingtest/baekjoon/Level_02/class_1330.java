package codingtest.baekjoon.Level_02;
import java.util.Scanner;

public class class_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum;
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();
        
        if(firstNum > secondNum) {
            System.out.println(">");
        } else if(firstNum < secondNum) {
            System.out.println("<");
        } else if(firstNum == secondNum) {
            System.out.println("==");
        }
        scanner.close();
    }
}
