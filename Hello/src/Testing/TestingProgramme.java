package Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestingProgramme {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
 class Demo
{
	public static void main(String[] args) {
		TestingProgramme t=new TestingProgramme();
		t.setMsg("success");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_new_project","root","root");
			String qr="INSERT INTO MSG values(?)";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, t.getMsg());
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate+ " "+"recordupdated");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}
