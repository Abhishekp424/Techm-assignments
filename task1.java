package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class task1 {
public static void main(String[] args) throws SQLException,Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&&useSSL=false","root","Neh@2003");
	Scanner haha=new Scanner(System.in);
	String c;
	do {
		System.out.println("Enter the Details:");
		System.out.println("Enter the Employee Id:");
	int empid=haha.nextInt();
	System.out.println("Enter the Employee Name:");
	String empname=haha.next();
	System.out.println("Enter the Employee Salary:");
	Double sal=haha.nextDouble();
	PreparedStatement ps=con.prepareStatement("insert into employees values(?,?,?)");
	ps.setInt(1,empid);
	ps.setString(2, empname);
	ps.setDouble(3, sal);
	int value=ps.executeUpdate();
	System.out.println(value+"Row inserted into the table");
	System.out.println("Do you want to insert another record: yes/no?");
	c=haha.next();
	c.toLowerCase();
	ps.close();
	}while(c.equals("yes"));
	haha.close();
	con.close();
}
}
