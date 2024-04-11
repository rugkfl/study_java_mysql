package codingtest.baekjoon;
import java.util.Scanner;
import java.util.ArrayList;

public class class_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int firstNum = scanner.nextInt();
        String secondNum = scanner.nextLine();
        
        int[] arrNum = new int[secondNum.length()];
        
        ArrayList<Integer> mulResult = new ArrayList<>();
        for(int i = 0; i < arrNum.length; i++) {
            int mulNum = firstNum * arrNum[i];
            mulResult.add(mulNum);
        }

        System.out.println(mulResult);


        scanner.close();

    }
    
}
