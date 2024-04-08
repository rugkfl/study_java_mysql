package co_templates;

import java.util.ArrayList;

public class TryCatchsSubs {
    // public void MethodSubs() {
    // System.out.println("MethodSubs - methodSubs()");
    // }
    // 접근자 리턴 메소드(=function) 이름(parameter) {
    // return 0;
    // }
    public void methodSubs() {
        System.out.println("MethodSubs - methodSubs()");
    }

    // with params
    public int methodSubsWithParamsReturn(int firstNumber, int secondNumber) {
        int resultNumber = 0;
        try {
            // Block of code to try
            System.out.println("MethodSubs - methodSubsWithParamsReturn(int firstNumber, int secondNumber)");
            System.out.println("params : firstNumber-" + firstNumber + ", secondNumber-" + secondNumber);
            resultNumber = firstNumber + secondNumber;
        } catch (Exception e) {
            // Block of code to handle errors
            System.out.println(
                    "MethodSubs - methodSubsWithParamsReturn(int firstNumber, int secondNumber) - catch (Exception e)");
        }
        return resultNumber;
    }

    public int returnException(int firstNumber) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        int result = 0; 
        try {
            System.out.println(myNumbers.get(10));
            result = myNumbers.get(10);
        } catch (Exception e) {
           System.out.println("catch (Exception e) : "+e.getMessage()); // try-catch 문에서 가장 많이 쓰는 구문
           result = myNumbers.get(0);
        }
        return result;
    }

}
