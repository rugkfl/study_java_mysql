package codingtest.baekjoon;
import java.util.Scanner;

public class class_10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        int firstResult = (firstNum + secondNum) % thirdNum;
        int secondResult = ((firstNum%thirdNum) + (secondNum%thirdNum)) % thirdNum;
        int thirdResult = (firstNum * secondNum) % thirdNum;
        int fourthResult = ((firstNum%thirdNum) * (secondNum%thirdNum)) % thirdNum;

        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);
        System.out.println(fourthResult);
        scanner.close();

    }
}
