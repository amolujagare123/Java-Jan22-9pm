package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String user = "root";
        String pass = "root";
        String url =  "jdbc:mysql://localhost:3306/730batch1";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. creating statement
        Statement st = con.createStatement();

        // 4. executing the query : DML / DDL
        // DML - Data manipulation language -> insert, update , delete
        // DDL - Data Definition language -> select
        // select , insert, update , delete
       /* String sql ="insert into student1 values (12,'Harshal','IT',99)";
        st.executeUpdate(sql);*/

       /* String sql ="delete from student1 where rno=4";
        st.executeUpdate(sql);*/
        String sql ="update student1 set marks=50 where firstName like 'a%'";
        st.executeUpdate(sql);
    }
}
