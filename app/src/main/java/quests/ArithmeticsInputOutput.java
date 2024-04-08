package quests;

import java.util.HashMap;
import java.util.Scanner;

public class ArithmeticsInputOutput {
    public HashMap<String, Integer> arithmeticsInput() {
        HashMap<String, Integer> inputValues = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("firstNumber : ");
            int firstNumber = scanner.nextInt();
            System.out.print("secondNumber : ");
            int secondNumber = scanner.nextInt();

            inputValues.put("firstNumber", firstNumber);
            inputValues.put("secondNumber", secondNumber);

        } catch (Exception e) {
            System.out.println("catch (Exception e) : " + e.getMessage());
            
        }
        scanner.close();
        return inputValues;
    }

     // 출력 메소드
     public void arithmeticsOutput(int sum, int minus, int multiple, int divide, int rest) {
        System.out.println("sumResult: " + sum);
        System.out.println("Minus: " + minus);
        System.out.println("Multiplication: " + multiple);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + rest);

    }

}
