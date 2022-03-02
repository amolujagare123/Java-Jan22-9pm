package JDBC;

import java.sql.*;

public class JDBCDemo2 {

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

        // 4. executing the query :
        //--------------------------------------------
        // DDL - Data Definition language -> select
        String sql ="select * from student1 where rno=2";
        ResultSet rs = st.executeQuery(sql);

        // next() -> 1. it takes us to next record
        // 2. it returns true if the record is present next
        // if record is not present next it returns false

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("firstName")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }
     
    }
}
