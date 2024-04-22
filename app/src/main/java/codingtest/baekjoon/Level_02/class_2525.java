package codingtest.baekjoon.Level_02;
import java.util.Scanner;

public class class_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int cookMinutes = scanner.nextInt();

        if(minutes + cookMinutes >= 60) {
            if(hour+((minutes+cookMinutes) / 60) >= 24) {
                System.out.printf("%d %d", hour+((minutes+cookMinutes)/ 60) - 24, (minutes+cookMinutes)% 60);
            } else {
                System.out.printf("%d %d", hour+((minutes+cookMinutes)/ 60), (minutes+cookMinutes)% 60);
            }
        } else {
            System.out.printf("%d %d", hour, (minutes+cookMinutes));
        }
        System.out.println();

        scanner.close();
    }
    
}
