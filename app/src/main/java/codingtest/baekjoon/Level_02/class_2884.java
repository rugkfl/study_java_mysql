package codingtest.baekjoon.Level_02;
import java.util.Scanner;

public class class_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();

        if(minutes - 45 < 0) {
            if(hour == 0) {
                hour = 23;
                minutes += 60;
            } else {
                hour -= 1;
                minutes += 60;
            }
        }  
        System.out.printf("%d %d", hour, minutes - 45);
        System.out.println();
        scanner.close();
    }
}


// %d : 정수
// %f : 실수
// %s : 문자열
// %c : 문자
