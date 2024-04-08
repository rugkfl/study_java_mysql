package quests;
import java.util.Scanner;

public class AddtionsMain {
    public static void main(String[] args) {
        AddtionsSub subs = new AddtionsSub() ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("firstNumber : ");
        int firstNumber = scanner.nextInt();
        System.out.print("secondNumber : ");
        int secondNumber = scanner.nextInt();

        int result = subs.addtionsSub(firstNumber, secondNumber);

        System.out.println("result : "+result);

        scanner.close();
        
        return ;
    }
}
