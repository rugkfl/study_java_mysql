package co_templates.project.test;

import co_templates.project.Student;

public class StudentTest {
    
    public static void main(String[] args) {
        // 학생 객체 생성
        Student student = new Student(1, "홍길동", 3, "서울시 강남구", "010-1234-5678", "1995-05-10");

        // 학생 정보 출력
        System.out.println(student.toString());
        System.out.println("나이: " + student.getAge());
    }
}

