package codingtest.baekjoon;
import java.util.Scanner;

public class class_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt(); 
        
        String secondNumStr = String.valueOf(secondNum); // 정수를 문자열로 변환
        
        int[] arrNum = new int[secondNumStr.length()];

        for(int i =0 ; i < arrNum.length; i++ ) {
            arrNum[i] = secondNumStr.charAt(i) - '0'; // 문자열인 숫자를 int형으로 변환하면 아스키 코드 값으로 변환 | 0은 아스키코드 48이므로 - 48을 해줘서 원하는 숫자가 되게 해야함
        }

        for(int i = arrNum.length; i > 0 ; i--) { // 거꾸로 반복
            int mulNum = firstNum * arrNum[i- 1]; // -1을 해줘야지 인덱스 번호가 맞음
            System.out.println(mulNum);
        }

        int result = firstNum * secondNum ;
        System.out.println(result);

        scanner.close();

    }
    
}
