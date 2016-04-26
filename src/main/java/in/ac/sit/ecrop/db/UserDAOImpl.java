package in.ac.sit.ecrop.db;

import in.ac.sit.ecrop.model.Cultivator;
import in.ac.sit.ecrop.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	 private DBConnectionManager db;
	public String findUser(User u)
	{
		String role=null;
		String sql = "Select role,username from user where username=? and password=?";
		Connection conn = db.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ps.setString(2,u.getPassword());
			ps.execute();
			
			ResultSet rs = ps.executeQuery();
			while(rs!=null && rs.next())
			{
				role=rs.getString(1);
			}		
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return role;
	}
	
	public List<Cultivator> searchCultivator(int id)
	{
		String sql="select fname,lname adhar_no,phone_no from cultivator where id=?";
		Connection conn=db.getConnection();
        List<Cultivator> list1=new ArrayList<Cultivator>();
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while(rs!=null && rs.next())
				{
					Cultivator c=new Cultivator(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
					list1.add(c);
		        }
		conn.close();
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		return list1;
	}


}
