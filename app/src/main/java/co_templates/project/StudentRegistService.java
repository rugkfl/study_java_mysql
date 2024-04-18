package co_templates.project;

public class StudentRegistService {
    public String compareBirthRegistForm(Student student) {
        String student_birth = student.getStudent_birth();
        
        // 예를 들어, student_birth의 형식이 "YYYY-MM-DD"가 아니라면 유효하지 않다고 판단
        if (!isValidDateFormat(student_birth)) {
            return "Invalid date format";
        }
        
        // 추가적인 유효성 검사 로직을 여기에 구현할 수 있습니다.

        return null; // 유효한 경우 null 반환
    }

    private boolean isValidDateFormat(String date) {
        // 실제로 유효한 날짜 형식인지 확인하는 로직
        // 여기서는 간단하게 "-"를 포함하는 형식으로만 유효성을 확인하는 예제를 들었습니다.
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
}
