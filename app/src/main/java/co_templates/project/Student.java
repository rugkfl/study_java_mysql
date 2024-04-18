package co_templates.project;

import java.util.Calendar;

// student 테이블에서 하나의 레코드 데이터로 다루어질 학생 한명의 정보를 저장하는 클래스 
public class Student {
    
    private int student_no; // 학번
    private String student_name; // 학생 이름
    private int student_year; // 학생 학년
    private String student_addr; // 학생 주소
    private String student_tel; // 학생 전화번호
    private String student_birth; // 학생 생년월일
    private int age; // 학생 나이

    @Override
    public String toString() {
        return student_no + "  " + student_name + "  " + student_year + "  " + student_addr + "  " + student_tel + "  " + student_birth + "  " + age ;
    }

    public Student(int student_no, String student_name, int student_year, String student_addr, String student_tel, String student_birth) {
        super();
        this.student_no = student_no;
        this.student_name = student_name ;
        this.student_year = student_year ;
        this.student_addr = student_addr ;
        this.student_tel = student_tel ;
        this.student_birth = student_birth ;
        this.age = calculateAge(student_birth);
    }

    private int calculateAge(String student_birth) { // calculateAge() : 학생의 생년월일 기반으로 나이를 계산 / 현재 연도와 학생의 생년월일을 비교하여 나이 계산
        StudentRegistService studentRegistService = new StudentRegistService(); 
        String unfitForm = studentRegistService.compareBirthRegistForm(this);
    

        if(unfitForm != null) {
            return 0;
        }

        int firstHyphenIndex = student_birth.indexOf("-");
        int secondHyphenIndex = student_birth.indexOf("-", firstHyphenIndex + 1);
        int birthYear = Integer.parseInt(student_birth.substring(0, firstHyphenIndex));
        int birthMonth = Integer.parseInt(student_birth.substring(firstHyphenIndex+1, secondHyphenIndex));
        int birthDay = Integer.parseInt(student_birth.substring(secondHyphenIndex + 1));

        int nowYear = Calendar.getInstance().get(Calendar.YEAR);
        int nowMonth = Calendar.getInstance().get(Calendar.MONTH) + 1 ;
        int nowDay = Calendar.getInstance().get(Calendar.DATE);
        int age = nowYear-birthYear;
        if(nowMonth*100 + nowDay < birthMonth*100 + birthDay) {
            age --;
        }
        return age;
    }

    public int getStudent_no() {
        return student_no;
    }

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_year() {
        return student_year;
    }

    public void setStudent_year(int student_year) {
        this.student_year = student_year;
    }

    public String getStudent_addr() {
        return student_addr;
    }

    public void setStudent_addr(String student_addr) {
        this.student_addr = student_addr;
    }

    public String getStudent_tel() {
        return student_tel;
    }

    public void setStudent_tel(String student_tel) {
        this.student_tel = student_tel;
    }

    public String getStudent_birth() {
        return student_birth;
    }

    public void setStudent_birth(String student_birth) {
        this.student_birth = student_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
