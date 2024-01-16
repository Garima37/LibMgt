package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {
	
		Connection con;
		PreparedStatement st;
		ResultSet rs;
		
		public AdminDao() {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver found! ");
				
				 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","garimagarima");
				System.out.println("connection created");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}
		public Admin checkLogin(String id, String password)
		{
			Admin a= null;
			try {
				st=con.prepareStatement("select * from admin where adminid=? and password=?");
				st.setString(1,id);
				st.setString(2, password);
			    rs=st.executeQuery();
	        
			if(rs.next()) 
			{
				a=new Admin();
				a.setUid(rs.getString(1));
				a.setName(rs.getString(2));
				a.setPassword(rs.getString(3));
				
			}
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return a;
		}
		
		public int saveAdminRecord(Admin a) {
			int status=0;
			try {
				st=con.prepareStatement("insert into admin values(?,?,?)");
				st.setString(1, a.getUid());
				st.setString(2, a.getName());
				st.setString(3,a.getPassword());
				
				
				status=st.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}
		

		

		
	}


