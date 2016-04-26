package in.ac.sit.ecrop.db;

import in.ac.sit.ecrop.model.Assessment;

import java.util.List;

public interface AssessmentDAO {
	
	public List<String> getSurvey();
	
	public List<Integer> getCultivator();
	
	public int createAssessment(Assessment assmt);
	
	public int createTestAssessment(Assessment assmt);
	
	public boolean insertFertilizer(Assessment assmt);
	
	public boolean insertPesticide(Assessment assmt);
	
	public boolean insertSeed(Assessment assmt);
	
	public boolean insertInsurance(Assessment assmt);
	
	public List<Assessment> viewAssessment();
	
	public Assessment viewAssessment(int assess_id);
	
	public List<Assessment> searchAssessment(String year);
	
	public boolean insertAssmtFile(Assessment assmt);

}
