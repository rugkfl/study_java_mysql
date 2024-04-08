package co_templates;

public class TryCatchsMain {
    public static void main(String[] args) {
        // try {
        //     //  Block of code to try (평소에 작성하는 코드)
        //   }
        //   catch(Exception e) { (방어할 코드 )
        //     //  Block of code to handle errors
        //   }

        try {
           TryCatchsSubs subs = new TryCatchsSubs(); // function임
            // subs.methodSubs();
            // subs.methodSubsWithParams("gyungha", 5);
            // int result = subs.methodSubsWithParamsReturn(5, 6);
            int result = subs.returnException(3);
            return ; // early return
          } catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("catch(Exception e)");
          }
          return ;
    }
}

