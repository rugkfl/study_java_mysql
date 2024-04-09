package quests;

import java.util.HashMap;

public class EncapsulationMain {
    public static void main(String[] args) {
        // 입력 받기
        EncapsulationInputOutput inputOutput = new EncapsulationInputOutput(); // ArithmeticsInputOutput의 클래스의 객체를 생성 
        HashMap<String, Integer> inputValues = inputOutput.encapsulationInput(); // ArithmeticsInputOutput클래스의 arithmeticsInput 메소드를 호출하여 사용자로부터 입력(HashMap 객체를 반환) 

        // 사칙연산
        EncapsulationSub subs = new EncapsulationSub(); // ArithmeticsSub 클래스의 객체를 생성 
        int divide = subs.encapsulationDivide(inputValues);
        int rest = subs.encapsulationRest(inputValues);

        // 출력
        inputOutput.encapsulationOutput(divide, rest);

        } 
}
    

