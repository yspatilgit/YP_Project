package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.testng.annotations.Test;

public class MySqlConnect {
	
  @Test
  public void testDB() throws ClassNotFoundException, SQLException {
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  System.out.println("Driver loaded");	  
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","selenium");
	  System.out.println("Connected to MySql DB");
	  Statement stm = con.createStatement();
	  
	  ResultSet rs = stm.executeQuery("select * from seleniumuser");
	  //ResultSet ins = stm.executeQuery("insert into seleniumuser values('Yogesh21','yogesh21@gmail.com')");	
	  while (rs.next())
	  {
		  String firstname = rs.getString("firstname");
		  System.out.println("Databse record is:" + firstname);
		 
		  String email = rs.getString("email");
		  System.out.println("Databse record is:" + email);
	  }

	  /*// Code to add entries in sql table
	   
	  PreparedStatement stmt = con.prepareStatement("insert into seleniumuser(firstname,email)values(?,?)");
	  stmt.setString(1, "amolam");
	  stmt.setString(2, "amolm@gamail.com");
	  stmt.executeUpdate();
	  stmt.close();
	  con.close();
	  System.out.println("data added to MySql DB");
	  **/
  }
}
