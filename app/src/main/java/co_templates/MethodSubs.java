package co_templates;

public class MethodSubs {
        // public void MethodSubs() {
        //     System.out.println("MethodSubs - methodSubs()");
        // }
        // 접근자 리턴 메소드(=function) 이름(parameter) {
            // return 0;
        // }
        public void methodSubs() {
            System.out.println("MethodSubs - methodSubs()");
        }

        // with params 
        public int methodSubsWithParamsReturn(int firstNumber, int secondNumber) {
            System.out.println("MethodSubs - methodSubsWithParamsReturn(int firstNumber, int secondNumber)");
            System.out.println("params : firstNumber-"+firstNumber+", secondNumber-"+secondNumber);
            int resultNumber = firstNumber + secondNumber;
            return resultNumber;
        }
    
}
