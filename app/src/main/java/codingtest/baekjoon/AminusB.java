package codingtest.baekjoon;
import java.util.Scanner;

public class AminusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int result = firstNum - secondNum;
        System.out.println(result);
        scanner.close();

    }
    
}
