package in.ac.sit.ecrop.service;

import in.ac.sit.ecrop.db.SurveyDAO;
import in.ac.sit.ecrop.model.Survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SurveyService {
	
	@Autowired
	  SurveyDAO dao;
	
	public int createSurvey(Survey s)
	{
		return dao.createSurvey(s);
	}

	public boolean createSurveyBoundary(Survey s)
	{
		return dao.createSurveyboundary(s);
	}
}
