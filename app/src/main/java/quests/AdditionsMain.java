package quests;


public class AdditionsMain {
    public static void main(String[] args) {
        AdditionsSub subs = new AdditionsSub() ;

        int resultNumber = subs.addtionsSub();
        System.out.print("결과 : ");
        System.out.println(resultNumber);
        
    }
}
