package in.ac.sit.ecrop.db;

import in.ac.sit.ecrop.model.Survey;

public interface SurveyDAO {
	
	public int createSurvey(Survey s);
	
	public boolean createSurveyboundary(Survey s);

}
