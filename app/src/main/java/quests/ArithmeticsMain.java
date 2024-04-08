package quests;

import java.util.HashMap;

public class ArithmeticsMain {
    public static void main(String[] args) {
        // 입력 받기
        ArithmeticsInputOutput inputOutput = new ArithmeticsInputOutput();
        HashMap<String, Integer> inputValues = inputOutput.arithmeticsInput();

        // 사칙연산
        ArithmeticsSub subs = new ArithmeticsSub();
        int sum = subs.arithmeticsSum(inputValues);
        int minus = subs.arithmeticsMinus(inputValues);
        int multiple = subs.arithmeticsMultiple(inputValues);
        int divide = subs.arithmeticsDivide(inputValues);
        int rest = subs.arithmeticsRest(inputValues);

        // 출력
        inputOutput.arithmeticsOutput(sum, minus, multiple, divide, rest);

        } 
}
    

