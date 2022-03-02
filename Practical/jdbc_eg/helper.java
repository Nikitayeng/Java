package nikita.jdbcc_eg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class helper {
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//old driver com.mysql.jdbc.Driver
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
		public static Connection makeCon() throws SQLException{
			return
			DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","Nikita1");
		}
	
		

}