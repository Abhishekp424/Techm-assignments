package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectMySQLDB {
public static void main(String[] args)throws Exception  {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&&useSSL=false","root","Neh@2003");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from employees");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println(rs.getDouble(3));
		}
		rs.close();
		stmt.close();
		con.close();
}
}
