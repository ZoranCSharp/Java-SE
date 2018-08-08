import java.sql.*;

public class EmployeeList {

public static void main(String ars[]){

    try {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Employee");

        while (rs.next()) {
            int empNo = rs.getInt("EMPNO");
            String eName = rs.getString("ENAME");
            String job = rs.getString("JOB_TITLE");
            System.out.println("" + empNo + "" + eName + "" + job);
        }
    }catch(SQLException se){
            System.out.println("SQL Error: " + se.getMessage() + " code: " + se.getErrorCode());
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

