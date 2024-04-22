package codingtest.baekjoon.Level_02;

import java.util.Scanner;

public class class_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if(firstNum == secondNum) { // firstNum == secondNum
            if(firstNum == thirdNum) { // firstNum == secondNum == thirdNum
                System.out.println(10000+(firstNum * 1000)); // 같은 눈 : firstNum
            } else { // firstNum == secondNum != thirdNum
                System.out.println(1000+(firstNum * 100)); // 같은 눈 : firstNum
            } 
        } else { // firstNum != secondNum
            if(firstNum == thirdNum){ // firstNum != secondNum && firstNum == thirdNum
                System.out.println(1000+(firstNum * 100)); // 같은 눈 : firstNum
            } else if(secondNum == thirdNum){ // firstNum != secondNum && secondNum == thirdNum
                System.out.println(1000+(secondNum * 100)); // 같은 눈 : secondNum
            } else { // firstNum != secondNum !=  thirdNum
                if(firstNum > secondNum && firstNum > thirdNum){ // firstNum이 최대값
                    System.out.println(firstNum * 100);
                } else if(secondNum > firstNum && secondNum > thirdNum) { // secondNum이 최대값
                    System.out.println(secondNum * 100);
                } else {  // thirdNum이 최대값
                    System.out.println(thirdNum * 100);
                }
            }
        }
        scanner.close();
    }
}
