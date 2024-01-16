package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	Connection con;
	PreparedStatement st;
	ResultSet rs;
	
	public UserDao() {
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
	public User checkLogin(String id, String password)
	{
		User u= null;
		try {
			st=con.prepareStatement("select * from user where userid=? and password=?");
			st.setString(1,id);
			st.setString(2, password);
		    rs=st.executeQuery();
        
		if(rs.next()) 
		{
			u=new User();
			u.setUid(rs.getString(1));
			u.setName(rs.getString(2));
			u.setPassword(rs.getString(3));
			
		}
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return u;
	}
	public int saveUserRecord(User u) {
		int status=0;
		try {
			st=con.prepareStatement("insert into user values(?,?,?)");
			st.setString(1, u.getUid());
			st.setString(2, u.getName());
			st.setString(3,u.getPassword());
			
			
			status=st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public int saveIssueRecord(User u) {
		int status=0;
		try {
			st=con.prepareStatement("insert into issueTo values(?,?,?,?,?)");
			st.setString(1, u.getUid());
			st.setString(2, u.getName());
			st.setString(3, u.getPhnno());
			st.setString(4, u.getEmail());
			st.setString(5, u.getMembership_dur());
			
			status=st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
		
	}
	
	public int saveBookRecord(User u) {
		int status=0;
		try {
			st=con.prepareStatement("insert into bookInfo values(?,?,?)");
			st.setString(1, u.getBookID());
			st.setString(2, u.getBookName());
			st.setString(3, u.getAuthor());
			
			
			status=st.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
		
	}
	

	}

