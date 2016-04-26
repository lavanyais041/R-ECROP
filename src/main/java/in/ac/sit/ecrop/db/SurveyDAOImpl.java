package in.ac.sit.ecrop.db;

import in.ac.sit.ecrop.model.Survey;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SurveyDAOImpl implements SurveyDAO{
	
	@Autowired
	 private DBConnectionManager db;
	
	ResultSet keyset;
	public int createSurvey(Survey s)
	{
		String sql="insert into survey(survey_number,owner_name,soil_color,area)values(?,?,?,?)";
		int row=0;
		Connection conn = db.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getSurvey_no());
			ps.setString(2, s.getOwner_name());
			ps.setString(3, s.getSoil_color());
			ps.setString(4, s.getArea());
			row=ps.executeUpdate();
			/*keyset=ps.getGeneratedKeys();
			while(keyset.next()&&keyset!=null)
			{
				key=keyset.getInt(1);
			}*/
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row;
	}
	
	public boolean createSurveyboundary(Survey s)
	{
	  String sql="insert into survey_boundary(survey_no,point,longitude,lattitude)values(?,?,?,?)";
	  int row=0;
	  Connection conn = db.getConnection();
	
	  try 
	  {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,s.getSurvey_no() );
		ps.setInt(2, s.getSurvey_boundary().getPoint());
		ps.setFloat(3, s.getSurvey_boundary().getLongitude());
		ps.setFloat(3, s.getSurvey_boundary().getLatitude());
		row=ps.executeUpdate();
		conn.close();
	  } 
	  catch (SQLException e) 
	  {
			e.printStackTrace();
	  }
	  return row>0;
	}


}
