package nikita.jdbcc_eg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class switch_jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int id,sage;
			String sname;
			Class.forName("com.mysql.cj.jdbc.Driver");//old driver com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","Nikita1");
			Statement st=con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			do {
			
			System.out.println("Enter your choice:\n1:select\n2:insert\n3:update\n4:delete");
			//System.out.println("enter your choice:");
			int ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1:ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
			}
			break;
			case 2:
	      PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
    	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("enter id");
    		 id=Integer.parseInt(br.readLine());
    		System.out.println("enter name");
    		 sname=br.readLine();
    		System.out.println("enter age");
    		sage=Integer.parseInt(br.readLine());
    		ps.setInt(1,id);
    		ps.setString(2, sname);
    		ps.setInt(3, sage);
    		ps.executeUpdate();
    	System.out.println("inserted succesfully into table");
         break;
			case 3:
				System.out.println("enter id");
			 id=Integer.parseInt(br.readLine());
			 System.out.println("enter name");
	    		sname=br.readLine();
         st.executeUpdate("update student set sname='"+sname+"' where id=" +id);
 		System.out.println("Updated successfully ");
			break;
			case 4:
				System.out.println("enter id");
				id=Integer.parseInt(br.readLine());
				st.executeUpdate("delete from student where id="+id);
		    	System.out.println("delete succesfully into table");
		    	break;
		    	default:
		    		System.out.println("enter valid data");
			}
		System.out.println("DO you want to continue:y/n");
			String s=br.readLine();
			if(s.startsWith("n"))
			{
				break;
			}
			
			
			//con.close();
			}while(true);
		//			con.close();
			}
			
		catch(Exception e) {
    		System.out.println(e);
    	}
	}

}