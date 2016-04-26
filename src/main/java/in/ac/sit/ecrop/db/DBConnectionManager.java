package in.ac.sit.ecrop.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnectionManager
{
	@Autowired
	DataSource dataSource;
	
	public Connection getConnection()
	{
		Connection conn=null;
		try 
		{
			conn=dataSource.getConnection();
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return conn;
		
	}
}
