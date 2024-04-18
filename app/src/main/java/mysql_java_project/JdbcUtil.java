package mysql_java_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//  JDBC (Java Database Connectivity)를 사용하여 MySQL 데이터베이스에 접속하고 SQL 연산을 수행하는 유틸리티 클래스
public class JdbcUtil {
    static { 
        try { // 클래스가 로드될 때 MySQL JDBC 드라이버를 등록
            Class.forName("com.mysql.jdbc.Driver"); // Class.forName() 메서드를 사용하여 드라이버를 로드
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 데이터베이스 연결 설정 및 해당 Connection 객체를 반환
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://java_mysql_mysql/java_mysql", "cocolabhub", "cocolabhub");
            con.setAutoCommit(false); // 자동 커밋 비활성화 => 모든 작업이 성공적으로 완료되었을때만 커밋을 수행하기 위함
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // Statement 객체와 ResultSet 객체를 안전하게 닫는 역할 / 리소스 관리를 위한 메소드
    public static void close(Statement stmt) {
        try{
            stmt.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }  // 리소스 관리가 효율적으로 이루어져 코드이 안정성과 가독성이 향상

    // 현재 트랜잭션 커밋(트랜잭션 관리)
    public static void commit(Connection con) {
        try {
            con.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    // 트랜잭션을 롤백(트랜잭션 관리)
    public static void rollback(Connection con) {
        try {
            con.rollback();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        // => 데이터베이스 연결과 관련된 일반적인 작업을 훨씬 간결하게 처리 가능
    } // 트랜잭션 : 데이터베이스 관리 시스템에서 여러 개의 연산을 하나의 작업 단위로 묶어서 처리하는 방법
    
}
