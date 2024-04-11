package codingtest.baekjoon;
import java.util.Scanner;

public class class_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int sumResult = firstNum + secondNum;
        int minusResult = firstNum - secondNum;
        int multipleResult = firstNum * secondNum;
        int divideResult = firstNum / secondNum;
        int restResult = firstNum % secondNum;

        System.out.println(sumResult);
        System.out.println(minusResult);
        System.out.println(multipleResult);
        System.out.println(divideResult);
        System.out.println(restResult);

        scanner.close();
    }
    
}
