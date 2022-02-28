package nikita.jdbcc_eg;

import java.sql.Connection;	
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
 		   Class.forName("com.mysql.cj.jdbc.Driver");
 		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","Nikita1");
 		   Statement st=con.createStatement();
 		   st.executeUpdate("update student SET sname= 'jaanu' where sid=5");
 		   System.out.println("updated successfully into table");
 		   ResultSet rs=st.executeQuery("select * from student");
 		   while(rs.next()) {
 			   System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
 		   } 
 		   con.close();
 		   }
 	   catch(Exception e) {
 		   System.out.println(e);
 }
	}

}
