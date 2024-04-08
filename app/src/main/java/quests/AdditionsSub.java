package quests;
import java.util.Scanner;

public class AdditionsSub {
    public int addtionsSub() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("firstNumber : ");
        int firstNumber = scanner.nextInt();
        System.out.print("secondNumber : ");
        int secondNumber = scanner.nextInt();
        int resultNumber = firstNumber + secondNumber ;
        scanner.close();
        return resultNumber;
        

    }
    
}
