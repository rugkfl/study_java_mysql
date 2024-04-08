package quests;

import java.util.HashMap;

public class ArithmeticsSub {
    // 덧셈
    public int arithmeticsSum(HashMap<String, Integer> inputValues){ // 입력받은 HashMap inputValues를 통해 계산
        int resultNumber = 0;
        
        try {
            int firstNumber = inputValues.get("firstNumber"); // HashMap의 키 값을 가져옴
            int secondNumber = inputValues.get("secondNumber");
            resultNumber = firstNumber + secondNumber ;
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return resultNumber;
    }

    // 뺄셈 
    public int arithmeticsMinus(HashMap<String, Integer> inputValues) {
        int resultNumber = 0;
        
        try {
            int firstNumber = inputValues.get("firstNumber");
            int secondNumber = inputValues.get("secondNumber");
            resultNumber = firstNumber - secondNumber ;
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return resultNumber;
        
    }

    // 곱셈
    public int arithmeticsMultiple(HashMap<String, Integer> inputValues) {
        int resultNumber = 0;
        
        try {
            int firstNumber = inputValues.get("firstNumber");
            int secondNumber = inputValues.get("secondNumber");
            resultNumber = firstNumber * secondNumber ;
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return resultNumber;
        
    }

    // 나눗셈
    public int arithmeticsDivide(HashMap<String, Integer> inputValues) {
        int resultNumber = 0;
        
        try {
            int firstNumber = inputValues.get("firstNumber");
            int secondNumber = inputValues.get("secondNumber");
            resultNumber = firstNumber / secondNumber ;
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return resultNumber;
    }

    // 나머지
    public int arithmeticsRest(HashMap<String, Integer> inputValues) {
        int resultNumber = 0;
        
        try {
            int firstNumber = inputValues.get("firstNumber");
            int secondNumber = inputValues.get("secondNumber");
            resultNumber = firstNumber % secondNumber ;
        } catch (Exception e) {
            System.out.println("catch (Exception e) : "+e.getMessage());
        }
        return resultNumber;
    }

}

            
        

    

