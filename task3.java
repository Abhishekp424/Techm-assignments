package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&&useSSL=false","root","Neh@2003");
		Scanner haha=new Scanner(System.in);
		System.out.println("Enter the id whose details should be deleted:");
		int id=haha.nextInt();
		PreparedStatement ps=con.prepareStatement("delete from employees where empid=?");
		ps.setInt(1, id);
		int value=ps.executeUpdate();
		if(value>0)
			System.out.println("Row deleted");
		else
			System.out.println("Id not found");
		haha.close();
		
	}
}
