package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class task2 {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&&useSSL=false","root","Neh@2003");
	Scanner haha=new Scanner(System.in);
	System.out.println("Enter the id whose details should be updated:");
	int id=haha.nextInt();
	System.out.println("Enter the new Name:");
	String replacename=haha.next();
	System.out.println("Enter the new Sal:");
	Double replacesal=haha.nextDouble();
	PreparedStatement ps=con.prepareStatement("update employees set empname=?,sal=? where empid=?");
	ps.setString(1,replacename);
	ps.setDouble(2,replacesal);
	ps.setInt(3, id);
	
	haha.close();
	int value=ps.executeUpdate();
	if(value>0)
		System.out.println("Row Updated in the table");
	else
		System.out.println("EmpId not found");
}
}
