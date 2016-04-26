package in.ac.sit.ecrop.db;

import in.ac.sit.ecrop.model.Assessment;
import in.ac.sit.ecrop.util.AssessmentPrediction;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AssessmentDAOImpl implements AssessmentDAO{
	
	@Autowired
	 private DBConnectionManager db;
	
	public List<String> getSurvey()
	{
		String sql="select survey_number from survey";
		Connection conn=db.getConnection();
		List<String> survey_numbers=new ArrayList<String>();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet keyset=ps.executeQuery();
			
			while(keyset!=null && keyset.next())
			{
				String survey_number=keyset.getString(1);
				survey_numbers.add(survey_number);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return survey_numbers;
	}
	
	public List<Integer> getCultivator()
	{
		String sql="select id from cultivator";
		Connection conn=db.getConnection();
		List<Integer> cultivators=new ArrayList<Integer>();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet keyset=ps.executeQuery();
			
			while(keyset!=null && keyset.next())
			{
				int cultivator=keyset.getInt(1);
				cultivators.add(cultivator);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return cultivators;
	}
	
	public List<Assessment> viewAssessment()
	{
		String sql="select id,survey_number,area,crop,start_date,end_date,predicted_yield,image from assessment where year=?";
		Connection conn=db.getConnection();
        List<Assessment> list1=new ArrayList<Assessment>();
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, "2016");
				ResultSet rs = ps.executeQuery();
				while(rs!=null && rs.next())
				{
					InputStream in=rs.getBinaryStream(8);
					Assessment assmt=new Assessment(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
					if(in != null)
					{
						assmt.setImageRawData(IOUtils.toByteArray(in));	
					}
					
					list1.add(assmt);
		        }
		conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return list1;
	}
	
	public Assessment viewAssessment(int assess_id)
	{
		String sql="select id,survey_number,area,crop,start_date,end_date,predicted_yield,image from assessment where id=?";
		Connection conn=db.getConnection();
        Assessment assmt=null;
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, assess_id);
				ResultSet rs = ps.executeQuery();
				while(rs!=null && rs.next())
				{
					InputStream in=rs.getBinaryStream(8);
					assmt=new Assessment(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
					if(in != null)
					{
						assmt.setImageRawData(IOUtils.toByteArray(in));
					}
		        }
		conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return assmt;
	}
	
	public List<Assessment> searchAssessment(String year)
	{
		String sql="select id,survey_number,area,crop,start_date,end_date,predicted_yield,image from assessment where year=?";
		Connection conn=db.getConnection();
        List<Assessment> list1=new ArrayList<Assessment>();
		
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, year);
				ResultSet rs = ps.executeQuery();
				while(rs!=null && rs.next())
				{
					InputStream in=rs.getBinaryStream(8);
					Assessment assmt=new Assessment(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7));
					if(in != null)
					{
						assmt.setImageRawData(IOUtils.toByteArray(in));	
					}
					list1.add(assmt);
		        }
		conn.close();
		}
		catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return list1;
	}
	
	public boolean insertAssmtFile(Assessment assmt)
	{
		String sql="update assessment set image = ? where id=?";
		Connection conn=db.getConnection();
		int rows = 0;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setBinaryStream(1, new ByteArrayInputStream(assmt.getImageRawData()),assmt.getImageRawData().length);
			ps.setInt(2, assmt.getAssess_id());
			
			rows = ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows > 0;
	}
	
	public int createTestAssessment(Assessment assmt)
	{
			String sql="insert  into assessment(survey_number,year,area,crop,predicted_yield) values(?,?,?,?,?)";
		
		    Connection conn=db.getConnection();
		    int id = 0;
		    try
		    {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, assmt.getSurvey_number());
				ps.setInt(2, assmt.getYear());
				ps.setString(3, assmt.getArea());
				ps.setString(4, assmt.getCrop());
				ps.setFloat(5, assmt.getPredicted_yield());
				ps.executeUpdate();
				ResultSet keyset=ps.getGeneratedKeys();
				if(keyset.next()&&keyset!=null)
				{
					id=keyset.getInt(1);
				}
			
				conn.close();
			} 
		    catch (SQLException e)
		    {
					e.printStackTrace();
			}
		    return id;
	}
	
	public int createAssessment(Assessment assmt)
	{
		int id=0;
		String sql = null;
		if(assmt.getImageRawData() != null)
		{
			sql="insert  into assessment(survey_number,year,area,crop,cultivator_id,start_date,end_date,predicted_yield,image) values(?,?,?,?,?,?,?,?,?)";	
		}
		else
		{
			sql="insert  into assessment(survey_number,year,area,crop,cultivator_id,start_date,end_date,predicted_yield) values(?,?,?,?,?,?,?,?)";
		}
		
	    Connection conn=db.getConnection();
	    
	    try
	    {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, assmt.getSurvey_number());
			ps.setInt(2, 2016);
			ps.setString(3, assmt.getArea());
			ps.setString(4, assmt.getCrop());
			ps.setInt(5, assmt.getCultivator_id());
			ps.setString(6, assmt.getStart_date());
			ps.setString(7, assmt.getEnd_date());
			ps.setFloat(8, AssessmentPrediction.pridict(assmt));
			if(assmt.getImageRawData() != null)
			{
				ps.setBinaryStream(9, new ByteArrayInputStream(assmt.getImageRawData()),assmt.getImageRawData().length);
			}

			ps.execute();
			ResultSet keyset=ps.getGeneratedKeys();
			while(keyset.next()&&keyset!=null)
			{
				id=keyset.getInt(1);
			}
			
		} 
	    catch (SQLException e)
	    {
				e.printStackTrace();
		}
	    return id;
	}
	
	public boolean insertFertilizer(Assessment a)
	{
		String sql="insert into fertilizer(assess_id,name,quantity,cost)values(?,?,?,?)";
		int row=0;
		Connection conn =db.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getAssess_id());
			ps.setString(2, a.getFertilizer().getName());
			ps.setFloat(3, a.getFertilizer().getQuantity());
			ps.setFloat(4, a.getFertilizer().getCost());
			row=ps.executeUpdate();
			conn.close();
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row>0;
	}
	
	public boolean insertPesticide(Assessment a)
	{
		String sql="insert into pesticide(assess_id,name,quantity,cost)values(?,?,?,?)";
		int row=0;
		Connection conn =db.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getAssess_id());
			ps.setString(2, a.getPesticide().getName());
			ps.setFloat(3, a.getPesticide().getQuantity());
			ps.setFloat(4, a.getPesticide().getCost());
			row=ps.executeUpdate();
			conn.close();
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row>0;
	}
	
	public boolean insertSeed(Assessment a)
	{
		String sql="insert into seed(assess_id,breed,supplier,quantity,cost)values(?,?,?,?,?)";
		int row=0;
		Connection conn =db.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getAssess_id());
			ps.setString(2, a.getSeed().getBreed());
			ps.setString(3, a.getSeed().getSupplier());
			ps.setFloat(4, a.getSeed().getQuantity());
			ps.setFloat(5, a.getSeed().getCost());
			row=ps.executeUpdate();
			conn.close();
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
		return row>0;
	}
	
	public boolean insertInsurance(Assessment a)
	{
		String sql="insert into insurance(assess_id,policy_no,premium_cost,duration)values(?,?,?,?)";
		int row=0;
		Connection conn =db.getConnection();
		
		try 
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, a.getAssess_id());
			ps.setString(2, a.getInsurance().getPolicy_no());
			ps.setFloat(3, a.getInsurance().getPremium_cost());
			ps.setString(4, a.getInsurance().getDuration());
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
