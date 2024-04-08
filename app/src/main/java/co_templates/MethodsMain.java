package co_templates;

public class MethodsMain {
    public static void main(String[] args) {
        MethodSubs subs = new MethodSubs(); // function임
        // subs.methodSubs();
        // subs.methodSubsWithParams("gyungha", 5);
        int result = subs.methodSubsWithParamsReturn(5, 6);
        return ; 
    }
}

