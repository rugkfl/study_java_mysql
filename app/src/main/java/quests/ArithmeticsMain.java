package quests;

import java.util.HashMap;

public class ArithmeticsMain {
    public static void main(String[] args) {
        // 입력 받기
        ArithmeticsInputOutput inputOutput = new ArithmeticsInputOutput(); // ArithmeticsInputOutput의 클래스의 객체를 생성 
        HashMap<String, Integer> inputValues = inputOutput.arithmeticsInput(); // ArithmeticsInputOutput클래스의 arithmeticsInput 메소드를 호출하여 사용자로부터 입력(HashMap 객체를 반환) 

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
    

